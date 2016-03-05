package boot.examples.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * curl -d '{"key1":"value1"}'  -H "Content-Type: application/json" http://localhost:3001/v1/route2/
 * 
 * @author jabrena
 *
 */

@RestController
@RequestMapping("/v1")
public class Route2ControllerV1 {

	@RequestMapping(value = "route2", method = RequestMethod.POST)
    public Map route2() {
    	Map map = new HashMap();
    	map.put("prop1", "value1");
    	map.put("prop2", "value2");
        return map;
    }
}
