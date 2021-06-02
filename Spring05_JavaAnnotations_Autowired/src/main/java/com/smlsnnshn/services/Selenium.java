package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    @Autowired
    private OfficeHours officeHours;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (15 + officeHours.getExtraHours()));
    }

}
