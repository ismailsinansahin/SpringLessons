package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Selenium teaching hours : 15");
    }

}
