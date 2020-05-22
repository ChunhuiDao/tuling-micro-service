package com.dch.springcode.config;

import com.dch.springcode.entity.People;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:myBeans.xml")
@Import({People.class, BeanImportSelector.class, MyBeanDefinitionRegister.class})
public class config {
}
