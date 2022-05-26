package org.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.assignment")
public class AppConfig {


    //if you're ever asked to retrieve an object of type phone, return a new phone object
    @Bean
    public Phone phoneConfig(){
        return new Phone();
    }
}
