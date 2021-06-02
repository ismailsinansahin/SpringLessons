package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {

    @Override
    public int getExtraHour() {
        return 5;
    }

}
