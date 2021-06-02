package com.smlsnnshn;

import com.smlsnnshn.interfaces.Mentor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring01SpringContainerApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring01SpringContainerApplication.class, args);

        //        BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        //ApplicationContext is already implementing BeanFactory
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        //There is an upcasting here...
        Mentor mentor1 = (Mentor)container.getBean("fullTimeMentor");

        //There is an implicit downcasting here...
        Mentor mentor2 = container.getBean("partTimeMentor",Mentor.class);

        mentor1.createAccount();
        mentor2.createAccount();

    }

}
