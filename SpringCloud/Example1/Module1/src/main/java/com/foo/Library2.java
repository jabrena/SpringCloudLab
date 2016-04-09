package com.foo;

import ch.qos.logback.classic.Level;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Library2 {

    public boolean method1(){

        log.trace("Hello World!");
        log.debug("How are you today?");
        log.info("I am fine.");
        log.warn("I love programming.");
        log.error("I am programming.");

        return true;
    }

}
