package com.geekster.project.assignment.URLHitCounterApplication.Repository;

import com.geekster.project.assignment.URLHitCounterApplication.Controller.UrlHitController;
import com.geekster.project.assignment.URLHitCounterApplication.Entity.UrlHitCounter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UrlHitRepo {

    @Autowired
    private List<UrlHitCounter> urlHit;

    public List<UrlHitCounter> getUrlHitCounter()
    {
        return  urlHit;
    }

    public void addUsers(UrlHitCounter u)
    {
        urlHit.add(u);
    }
}
