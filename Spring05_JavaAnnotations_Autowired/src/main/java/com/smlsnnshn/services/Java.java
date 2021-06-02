package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    // Field injection
    @Autowired
    private OfficeHours officeHours;

    // Constructor injection - we don't need to put annotation here if we have a constructor
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    // Setter injection - we don't need to put annotation here if we have a constructor
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getExtraHours()));
    }

}
