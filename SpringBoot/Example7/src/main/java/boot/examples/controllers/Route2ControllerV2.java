package boot.examples.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import boot.examples.model.ModelBasic;
import boot.examples.model.ResponseBasic;
import boot.examples.services.WeatherClient;
import hello.wsdl.GetCityForecastByZIPResponse;

/**
 * curl -d '{"key1":"value1"}'  -H "Content-Type: application/json" http://localhost:3001/v2/route2/
 * curl -d '{"key2":"value1"}'  -H "Content-Type: application/json" http://localhost:3001/v2/route2/
 * curl -d '{"key1":"value2"}'  -H "Content-Type: application/json" http://localhost:3001/v2/route2/
 * 
 * @author jabrena
 *
 */

@RestController
@RequestMapping("/v2")
public class Route2ControllerV2 {

	@RequestMapping(
			value = "route2", 
			method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map> route2(
			@RequestHeader(value="Content-Type") String contentType, 
			@Valid @RequestBody ModelBasic car,
			BindingResult bindingResults) {

		if (bindingResults.hasErrors()) {
	    	Map map = new HashMap();
	    	map.put("error", "bad value bindingResults");
			return new ResponseEntity<Map>(map, HttpStatus.BAD_REQUEST);	
        }

		System.out.println(contentType);
		System.out.println(car.key1);
		if(!car.key1.equals("value1")){
	    	Map map = new HashMap();
	    	map.put("error", "bad value on POJO");
			return new ResponseEntity<Map>(map, HttpStatus.BAD_REQUEST);					
		}

    	Map map = new HashMap();
    	map.put("prop1", "value1");
    	map.put("prop2", "value2");
    	
		return new ResponseEntity<Map>(map, HttpStatus.OK);	
    }
	
	@RequestMapping(value = "route3", method = RequestMethod.GET)
    public String route3() {
		WeatherClient weatherClient = new WeatherClient();
		String zipCode = "94304";
		GetCityForecastByZIPResponse response = weatherClient.getCityForecastByZip(zipCode);
        return response.toString();
		//return response;
    }
	

	
	/*
    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public Map handleException(MethodArgumentNotValidException exception) {
    	Map map = new HashMap();
    	map.put("error", "bad value");
        //return new ApiErrors(exception.getBindingResult());
    	return map;
    }
    */

}
