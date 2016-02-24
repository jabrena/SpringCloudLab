package boot.examples.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v2")
public class Concept1ControllerV2 {

	private static final Logger log = LoggerFactory.getLogger(Example4.class);

    @RequestMapping("concept1")
    public String hello() {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
        return quote.toString();
    }
}
