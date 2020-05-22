package com.dch.springcode.controller;

import com.dch.springcode.SpringcodeApplication;
import com.dch.springcode.dao.TestMapper;
import com.dch.springcode.entity.*;
import com.dch.springcode.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    private Fruit fruit;
    @Autowired(required = false)
    private TestMapper testMapper;
    @Autowired
    private TestService testService;
    @Autowired
    private People people;
    @Autowired(required = false)
    private Bird bird;
    @Autowired(required = false)
    private Dog dog;
    @Autowired(required = false)
    private Pig pig;
    @Autowired(required = false)
    private Sky sky;
    @Autowired(required = false)
    private Ocean ocean;

    @GetMapping("/springcode/test")
    public void t1() {
        System.out.println(fruit);
        System.out.println(getFruit());
        System.out.println(testMapper);
        System.out.println(testService);
        System.out.println(people);
        System.out.println(bird);
        System.out.println(dog);
        System.out.println(pig);
        System.out.println(sky);
        System.out.println(ocean);
    }

    public static Fruit getFruit() {
        return SpringcodeApplication.context.getBean(Fruit.class);
    }
}
