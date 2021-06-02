package com.smlsnnshn;

import com.smlsnnshn.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring05JavaAnnotationsValueApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring05JavaAnnotationsValueApplication.class, args);

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java",Course.class);

        System.out.println(course1.toString());

    }

}
