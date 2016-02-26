package boot.examples.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.client.RestTemplate;

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

        return restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
    }

}
