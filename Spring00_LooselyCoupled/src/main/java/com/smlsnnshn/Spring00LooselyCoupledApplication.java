package com.smlsnnshn;

import com.smlsnnshn.service.FullTimeMentor;
import com.smlsnnshn.service.Mentor;
import com.smlsnnshn.service.PartTimeMentor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring00LooselyCoupledApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring00LooselyCoupledApplication.class, args);

        FullTimeMentor fullTimeMentor = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        Mentor mentor1 = new Mentor(fullTimeMentor);
        Mentor mentor2 = new Mentor(partTimeMentor);

        mentor1.manageAccount();
        mentor2.manageAccount();

    }

}
