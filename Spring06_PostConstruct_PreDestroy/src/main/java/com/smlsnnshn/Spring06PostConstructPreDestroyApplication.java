package com.smlsnnshn;

import com.smlsnnshn.configs.CybertekAppConfig;
import com.smlsnnshn.interfaces.Course;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Spring06PostConstructPreDestroyApplication {

    public static void main(String[] args) {

        SpringApplication.run(Spring06PostConstructPreDestroyApplication.class, args);

        ApplicationContext container = new AnnotationConfigApplicationContext(CybertekAppConfig.class);

        Course course = container.getBean("java",Course.class);

        course.getTeachingHours();

        ((AnnotationConfigApplicationContext)container).close();

    }

}
