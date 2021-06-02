package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Selenium implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 10");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Executing post construct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Executing pre destroy");
    }

}
