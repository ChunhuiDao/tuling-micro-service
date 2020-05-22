package com.dch.springcode.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class BeanImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                "com.dch.springcode.entity.Bird",
                "com.dch.springcode.entity.Dog",
                "com.dch.springcode.entity.Pig"
        };
    }

}
