package com.example.demo.annotation;

import com.example.demo.configuration.HelloworldConfiguration;
import com.example.demo.configuration.HelloworldSelectorConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportSelector;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({HelloworldSelectorConfiguration.class})
public @interface EnableHelloWorldSelector {
    String model() default "first";
}
