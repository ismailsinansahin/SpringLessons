package com.smlsnnshn.configs;

import com.smlsnnshn.interfaces.ExtraSessions;
import com.smlsnnshn.services.Java;
import com.smlsnnshn.services.OfficeHours;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.smlsnnshn")
@PropertySource("classpath:application.properties")
public class CybertekAppConfig {

//    @Bean // without DI
//    public Java java(){
//        return new Java(); //calling the loosely coupled method
//    }

    @Bean
    public Java java(){
        return new Java(extraSessions()); //calling the loosely coupled method
    }

    @Bean  //this is more loosely coupled / we don't need to put @Bean here Ozzy said, but id did not work like that
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }

//    @Bean  //calling the tightly coupled method with OfficeHours Class
//    public Java java(){
//        return new Java(officeHours());
//    }

//    @Bean  //this is tightly coupled / we don't need to put @Bean here
//    public OfficeHours officeHours(){
//        return new OfficeHours();
//    }

}