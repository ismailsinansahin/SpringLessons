package com.smlsnnshn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class Spring10SecurityDefaultConfigurationApplication {

    public static void main(String[] args) {
        SpringApplication.run(Spring10SecurityDefaultConfigurationApplication.class, args);
    }

}
