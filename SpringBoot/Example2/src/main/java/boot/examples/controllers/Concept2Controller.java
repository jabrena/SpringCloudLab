package boot.examples.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Concept2Controller {

    @RequestMapping("concept3")
    public String hello() {
        return "This is the Concept3";
    }

}
