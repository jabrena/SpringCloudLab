package boot.examples.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import boot.examples.utils.RandomGenerator;

@RestController
@RequestMapping("/v1")
public class Concept1Controller {

    @RequestMapping("concept1")
    public Map hello() {
    	Map map = new HashMap();
    	map.put("developer", "Medina");
        return map;
    }

    @RequestMapping("/random/{numbers}")
    public RandomGenerator conversion(@PathVariable("numbers") int numbers) {
        return new RandomGenerator(numbers);
    }

}

