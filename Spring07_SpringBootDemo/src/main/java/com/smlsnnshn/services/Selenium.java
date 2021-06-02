package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import com.smlsnnshn.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    private ExtraSession extraSession;

    public Selenium(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public int getTeachingHours() {
        return 15 + extraSession.getExtraHour();
    }

}
