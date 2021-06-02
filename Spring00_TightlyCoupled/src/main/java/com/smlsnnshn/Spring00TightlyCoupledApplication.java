package com.smlsnnshn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring00TightlyCoupledApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring00TightlyCoupledApplication.class, args);

        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime,partTime);
        mentor.manageAccount();

    }

}
