package com.example.demo.configuration;

import com.example.demo.annotation.ConditionOnSystem;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class OnSystemCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        Map<String, Object> maps = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnSystem.class.getName());
        System.out.println("current system : " + maps.get("system"));
        return "linux".equals(maps.get("system"));
    }
}
