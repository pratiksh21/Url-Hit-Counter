package com.geekster.project.assignment.URLHitCounterApplication.Controller;

import com.geekster.project.assignment.URLHitCounterApplication.Entity.UrlHitCounter;
import com.geekster.project.assignment.URLHitCounterApplication.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    /*Get ALL Users
     * Get Specific User with number of Count The Same User Has Visited
     * Get The Number Of Visitors
     * Post a new Visitor
     * put Hit the Url to update counter for each Visitor */

    // Post a new Visitor

    @PostMapping("visitor")
    public String addAVisitor(@RequestBody UrlHitCounter user)
    {
        return urlHitService.addVisitor(user);
    }

    @GetMapping("visitors") //get all Visitors
    public List<UrlHitCounter> getAllVisitors()
    {
        return urlHitService.getAllVisitors();
    }

    @GetMapping("visitor/count") //Visitor Count
    public String getTheNumberOfVisitors()
    {
        return urlHitService.getCountOfVisitors();
    }

    @GetMapping("api/v1/visitor-count-app/username/{username}") //get specific user
    public UrlHitCounter getAVisitor(@PathVariable String username)
    {
        return urlHitService.getAVisitor(username);
    }
    @PutMapping("api/v1/count_update/username/{username}")
    public String countUpdated(@PathVariable  String username)
    {
        return urlHitService.countUpdated(username);
    }
}
