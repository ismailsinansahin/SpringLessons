package com.smlsnnshn.service;

import com.smlsnnshn.implementation.IMentor;

public class Mentor {

    com.smlsnnshn.implementation.IMentor IMentor;

    public Mentor(IMentor IMentor){
        this.IMentor = IMentor;
    }

    public void manageAccount(){
        this.IMentor.createAccount();
    }

}
