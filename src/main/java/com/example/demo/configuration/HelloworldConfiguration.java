package com.example.demo.configuration;

import com.example.demo.annotation.ConditionOnSystem;
import com.example.demo.bean.SayHelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class HelloworldConfiguration {
    @Bean
    @ConditionOnSystem(system = "linux")
    SayHelloWorld sayHelloWorld(){
        System.out.println("--------------------》 helloworld");
        return new SayHelloWorld();
    }
}
