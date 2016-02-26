package boot.examples.controllers;

import java.util.Arrays;
import java.util.concurrent.Future;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

@RestController
@RequestMapping("/v3")
public class Concept1ControllerV3 {

	private static final Logger log = LoggerFactory.getLogger(Example4.class);

    private RestClient restClient;

    public Concept1ControllerV3() {
        this(new RestClient());
    }

    public Concept1ControllerV3(RestClient restClient) {
        this.restClient = restClient;
    }
	
    @RequestMapping("concept1")
    public String hello() {
    	Observable<Quote> getQuote = getQuote();

        Observable<Quote> fullUser = Observable.zip(Arrays.asList(getQuote), objects -> {
        	Quote quo = (Quote) objects[0];

            return quo;
        });

        return fullUser.toBlocking().first().toString();
    	
    }
    
    private Observable<Quote> getQuote() {
        return Observable.create((Subscriber<? super Quote> s) -> s.onNext(restClient.getQuote()))
                .onErrorReturn(throwable -> {

                    return new Quote();
                })
                .subscribeOn(Schedulers.computation());
    }
}
