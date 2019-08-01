package com.example.demo;

import com.example.demo.annotation.EnableHelloWorld;
import com.example.demo.annotation.EnableHelloWorldSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableHelloWorld
//@EnableHelloWorldSelector
//@EnableWebMvc
//@EnableCaching
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
