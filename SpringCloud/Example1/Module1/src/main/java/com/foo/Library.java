package com.foo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Library {

    static final Logger log = LoggerFactory.getLogger(Library.class);

    public boolean method1(){

        log.trace("Hello World!");
        log.debug("How are you today?");
        log.info("I am fine.");
        log.warn("I love programming.");
        log.error("I am programming.");

        return true;
    }

}
