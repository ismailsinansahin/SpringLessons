package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {

    @Override
    public int getExtraHours() {
        return 5;
    }

}
