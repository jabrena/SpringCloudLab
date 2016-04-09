package com.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory
            .getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);

        logger.error("Message logged at ERROR level");
        logger.warn("Message logged at WARN level");
        logger.info("Message logged at INFO level");
        logger.debug("Message logged at DEBUG level");

    }

    @PostConstruct
    public void logSomething() {
        logger.debug("Sample Debug Message");
        logger.trace("Sample Trace Message");
    }

}