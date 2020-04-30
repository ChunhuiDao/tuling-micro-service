package com.dch.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @Autowired
    private ConfigurableApplicationContext context;

    @GetMapping("/aa")
    public void test() {

        System.out.println("======" + context.getEnvironment().getProperty("aa"));
    }
}
