package com.example.demo.annotation;

import com.example.demo.configuration.HelloworldConfiguration;
import org.springframework.context.annotation.Import;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({HelloworldConfiguration.class})
public @interface EnableHelloWorld {
}
