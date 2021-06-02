package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import com.smlsnnshn.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private ExtraSessions extraSessions;

    //Autowiring by Constructor Injection
    public Selenium(@Qualifier("mockInterviewHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (15+extraSessions.getExtraHours()));
    }

}
