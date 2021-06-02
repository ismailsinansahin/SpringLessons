package com.smlsnnshn;

import com.smlsnnshn.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring02DiConstructionInjectionApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring02DiConstructionInjectionApplication.class, args);

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java",Course.class);
        Course course2 = container.getBean("selenium",Course.class);

        course1.getTeachingHours();
        course2.getTeachingHours();

    }

}
