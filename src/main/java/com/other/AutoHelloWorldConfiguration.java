package com.other;

import com.example.demo.bean.SayHelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoHelloWorldConfiguration {
    @Bean
    AA sayAA(){
        System.out.println("--------------------》auto  AA");
        return new AA();
    }
}
