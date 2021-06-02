package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import com.smlsnnshn.interfaces.ExtraSessions;

public class Selenium implements Course {

    ExtraSessions extraSessions;

    public Selenium(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Selenium teaching hours : " + (15 + extraSessions.getExtraHours()));
    }

}
