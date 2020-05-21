package com.dch.springcode.controller;

import com.dch.springcode.entity.fruit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {
    @Autowired
    @Qualifier(value = "myfruit")
    private fruit fruit;

    @GetMapping("/springcode/test")
    public void t1() {
        System.out.println(fruit);
    }
}
