package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class API implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly API teaching hours : 10");
    }
}
