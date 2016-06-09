package edu.spring.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HelloWorldBoot {

    public static void main(String args[]) {
        SpringApplication.run(HelloWorldBoot.class);
    }

}