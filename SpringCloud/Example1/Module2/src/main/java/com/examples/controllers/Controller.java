package com.examples.controllers;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Slf4j
@RestController
@RequestMapping("/v1")
public class Controller {

    //private static final Logger log = LoggerFactory
    //        .getLogger(Controller.class);

    @RequestMapping("concept1")
    public Map hello() {
        Map map = new HashMap();
        map.put("developer", "OK");

        log.info("Testing demo");
        return map;
    }

}
