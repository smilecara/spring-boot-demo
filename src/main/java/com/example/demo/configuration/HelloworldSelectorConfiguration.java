package com.example.demo.configuration;

import com.example.demo.annotation.EnableHelloWorldSelector;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class HelloworldSelectorConfiguration implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        Map<String,Object> attrs = annotationMetadata.getAnnotationAttributes(EnableHelloWorldSelector.class.getName());
        System.out.println("--------------------model--->"+attrs.get("model"));
        return new String[]{
            HelloworldConfiguration.class.getName()
        };
    }
}
