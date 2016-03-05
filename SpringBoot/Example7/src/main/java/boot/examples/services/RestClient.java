package boot.examples.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

import boot.examples.model.Quote;

@Slf4j
public class RestClient {

    private final RestTemplate restTemplate;

    public RestClient() {
        this(new RestTemplate());
    }

    public RestClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Quote getQuote() {
    	final String address = "http://gturnquist-quoters.cfapps.io/api/random";
        return restTemplate.getForObject(address, Quote.class);
    }

}
