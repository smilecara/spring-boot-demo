package com.example.demo.annotation;

import com.example.demo.configuration.OnSystemCondition;
import org.springframework.context.annotation.Conditional;
import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional({OnSystemCondition.class})
public @interface ConditionOnSystem {
    String system();
}
