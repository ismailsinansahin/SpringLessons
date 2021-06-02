package com.smlsnnshn;

import com.smlsnnshn.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring04BeanLifeCycleApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring04BeanLifeCycleApplication.class, args);

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java",Course.class);

        course.getTeachingHours();

        ((ClassPathXmlApplicationContext)container).close();

    }

}
