package boot.examples;

import org.springframework.boot.SpringApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//implements CommandLineRunner 

@SpringBootApplication
public class Example4 {

    private static final Logger log = LoggerFactory.getLogger(Example4.class);

    public static void main(String args[]) {
        SpringApplication.run(Example4.class);
    }

    /*
    public void run(String... strings) throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
    */
}
