package com.geekster.project.assignment.URLHitCounterApplication.BeanManager;

import com.geekster.project.assignment.URLHitCounterApplication.Controller.UrlHitController;
import com.geekster.project.assignment.URLHitCounterApplication.Entity.UrlHitCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<UrlHitCounter> getUrlHitCounterList(){

        return new ArrayList<>();
    }
}