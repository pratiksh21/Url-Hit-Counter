package com.geekster.project.assignment.URLHitCounterApplication.Service;

import com.geekster.project.assignment.URLHitCounterApplication.Entity.UrlHitCounter;
import com.geekster.project.assignment.URLHitCounterApplication.Repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {

    @Autowired
    UrlHitRepo urlHitRepo;

    public List<UrlHitCounter> getAllVisitors()
    {
        return  urlHitRepo.getUrlHitCounter();
    }


    public String addVisitor(UrlHitCounter user) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter u : visitorlist)
        {
            if(u.getUserName().equals(user.getUserName()))
            {
                u.setCounter(u.getCounter()+1);
                return "Cannot add the same visitor count updated";
            }
        }
        visitorlist.add(user);

        return "Welcome to our Website !!!";
    }


    public String getCountOfVisitors() {

        List<UrlHitCounter> li = getAllVisitors();

        return "Visitors: "+li.size();
    }


    public UrlHitCounter getAVisitor(String username) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                return u;

            }
        }
        throw new IllegalStateException("UserName not found");
    }

    public String countUpdated(String username) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter u : visitorlist)
        {
            if(u.getUserName().equals(username))
            {
                u.setCounter(u.getCounter()+1);
                return "Welcome Back";
            }
        }


        return "User not found new User";
    }
}