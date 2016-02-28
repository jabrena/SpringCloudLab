package io.pivotal.cf.example.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("hello")
    public String hello() {
        return "Welcome to Spring Boot";
    }

}
