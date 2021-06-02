package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;

public class Selenium implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 15");
    }

}
