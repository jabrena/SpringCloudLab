package boot.examples.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
public class Example3 {

    public static void main(String[] args) {
        SpringApplication.run(Example3.class, args);
    }

}
