package boot.examples.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Concept3Controller {

    @RequestMapping("concept2")
    public String hello() {
        return "This is the Concept2";
    }

}
