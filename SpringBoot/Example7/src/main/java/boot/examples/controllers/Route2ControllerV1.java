package boot.examples.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import boot.examples.model.ModelBasic;
import boot.examples.model.ResponseBasic;

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
	public ResponseEntity<ResponseBasic> route2(@RequestBody ModelBasic car) {
		
		System.out.println(car.key1);
		
		ResponseBasic obj = new ResponseBasic();
		obj.prop1 = "value1";
		obj.prop2 = "value2";
		
		return new ResponseEntity<ResponseBasic>(obj, HttpStatus.OK);
    }
	
	@RequestMapping(value = "route2_1", method = RequestMethod.POST)
	public Map route2_1(@RequestBody ModelBasic car) {
		
		System.out.println(car.key1);
		
    	Map map = new HashMap();
    	map.put("prop1", "value1");
    	map.put("prop2", "value2");
        return map;
    }
	
	@RequestMapping(value = "route2_0", method = RequestMethod.POST)
    public Map route2_0() {
    	Map map = new HashMap();
    	map.put("prop1", "value1");
    	map.put("prop2", "value2");
        return map;
    }
}
