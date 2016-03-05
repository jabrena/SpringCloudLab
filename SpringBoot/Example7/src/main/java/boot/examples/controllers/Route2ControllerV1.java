package boot.examples.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import boot.examples.model.ModelBasic;
import boot.examples.model.ResponseBasic;

/**
 * curl -d '{"key1":"value1"}'  -H "Content-Type: application/json" http://localhost:3001/v1/route2/
 * curl -d '{"key2":"value1"}'  -H "Content-Type: application/json" http://localhost:3001/v1/route2/
 * curl -d '{"key1":"value2"}'  -H "Content-Type: application/json" http://localhost:3001/v1/route2/
 * 
 * @author jabrena
 *
 */

@RestController
@RequestMapping("/v1")
public class Route2ControllerV1 {

	@RequestMapping(
			value = "route2", 
			method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBasic> route2(
			@RequestHeader(value="Content-Type") String contentType, 
			@Valid @RequestBody ModelBasic car) {

		System.out.println(contentType);
		
		ResponseBasic obj = new ResponseBasic();
		System.out.println(car.key1);
		if(car.key1.equals("value1")){

			obj.prop1 = "value1";
			obj.prop2 = "value2";
			
			return new ResponseEntity<ResponseBasic>(obj, HttpStatus.OK);			
		}else {
			return new ResponseEntity<ResponseBasic>(obj, HttpStatus.BAD_REQUEST);
		}
		

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
