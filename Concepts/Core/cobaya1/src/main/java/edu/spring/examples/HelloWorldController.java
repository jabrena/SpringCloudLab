package edu.spring.examples;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms")
public class HelloWorldController {

    @RequestMapping("/method1")
    public String getMethod1() {
        return "demo";
    }

}

