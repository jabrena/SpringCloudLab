package com.foo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

public class Library3 {

    public boolean method1(){

        ch.qos.logback.classic.Logger log = (Logger) LoggerFactory.getLogger("com.foo");
        log.setLevel(Level.TRACE);

        log.trace("Hello World!");
        log.debug("How are you today?");
        log.info("I am fine.");
        log.warn("I love programming.");
        log.error("I am programming.");

        return true;
    }

}
