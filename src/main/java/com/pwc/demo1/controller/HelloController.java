package com.pwc.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }

    @RequestMapping("/hello1")
    public String hello() {
        return "hello1";
    }
    
    @RequestMapping("/login1")
    public String login() {
        return "login1";
    }

}
