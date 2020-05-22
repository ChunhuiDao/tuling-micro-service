package com.dch.springcode.config;

import com.dch.springcode.entity.Ocean;
import com.dch.springcode.entity.Sky;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition skyDefinition = new RootBeanDefinition(Sky.class);
        RootBeanDefinition oceanDefinition = new RootBeanDefinition(Ocean.class);
        registry.registerBeanDefinition("sky", skyDefinition);
        registry.registerBeanDefinition("ocean", oceanDefinition);
    }
}
