package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import com.smlsnnshn.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    //Autowiring by field injection
    @Autowired
    @Qualifier("officeHours")
    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (20+extraSessions.getExtraHours()));
    }

}
