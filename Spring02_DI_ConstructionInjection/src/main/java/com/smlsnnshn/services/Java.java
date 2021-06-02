package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import com.smlsnnshn.interfaces.ExtraSessions;

public class Java implements Course {

    ExtraSessions extraSessions;

    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Java teaching hours :" + (20 + extraSessions.getExtraHours()));
    }

}
