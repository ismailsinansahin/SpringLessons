package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : 20");
    }

}
