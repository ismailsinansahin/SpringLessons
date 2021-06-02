package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import com.smlsnnshn.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course{

    private ExtraSessions extraSessions;

    public Selenium(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (15+extraSessions.getExtraHours()));
    }

}
