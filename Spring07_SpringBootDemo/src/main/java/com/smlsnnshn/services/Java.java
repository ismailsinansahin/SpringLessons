package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Course;
import com.smlsnnshn.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSession extraSession;

    @Value("${instructor}")
    private String instructorName;

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public int getTeachingHours() {
        return 20 + extraSession.getExtraHour();
    }

}
