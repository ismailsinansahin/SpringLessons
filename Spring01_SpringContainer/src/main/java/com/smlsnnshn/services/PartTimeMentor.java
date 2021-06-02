package com.smlsnnshn.services;

import com.smlsnnshn.interfaces.Mentor;

public class PartTimeMentor implements Mentor {

    @Override
    public void createAccount() {
        System.out.println("Part Time Mentor account is created");
    }

}
