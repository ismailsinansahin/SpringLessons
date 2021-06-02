package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.ExtraSessions;

public class OfficeHours implements ExtraSessions {

    @Override
    public int getExtraHours() {
        return 5;
    }

}
