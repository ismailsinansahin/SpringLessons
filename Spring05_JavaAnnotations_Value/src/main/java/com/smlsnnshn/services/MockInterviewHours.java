package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSessions {

    @Override
    public int getExtraHours() {
        return 10;
    }

}
