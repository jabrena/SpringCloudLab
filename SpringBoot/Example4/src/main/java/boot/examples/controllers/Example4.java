package boot.examples.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Example4 implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(Example4.class);

    public static void main(String args[]) {
        SpringApplication.run(Example4.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}
