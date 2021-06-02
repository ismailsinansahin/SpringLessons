package com.smlsnnshn;

import com.smlsnnshn.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring03BeanScopeSingletonPrototypeApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring03BeanScopeSingletonPrototypeApplication.class, args);

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course1 = container.getBean("java",Course.class);
        Course course2 = container.getBean("java",Course.class);

        //java bean is using singleton scope
        System.out.println("Pointing to the same object       : " + (course1==course2));
        System.out.println("Memory location for the course1   : " + course1);
        System.out.println("Memory location for the course2   : " + course2);

        Course course3 = container.getBean("selenium",Course.class);
        Course course4 = container.getBean("selenium",Course.class);

        //selenium bean is using prototype scope
        System.out.println("Pointing to the same object       : " + (course3==course4));
        System.out.println("Memory location for the course3   : " + course3);
        System.out.println("Memory location for the course4   : " + course4);

    }

}
