package boot.examples.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import boot.examples.model.Quote;
import boot.examples.services.RestClient;
import lombok.extern.slf4j.Slf4j;
import rx.Observable;
import rx.Subscriber;
import rx.schedulers.Schedulers;

@Slf4j
@RestController
@RequestMapping("/v3")
public class Concept1ControllerV3 {

    private RestClient restClient;

    public Concept1ControllerV3() {
        this(new RestClient());
    }

    public Concept1ControllerV3(RestClient restClient) {
        this.restClient = restClient;
    }
	
    @RequestMapping("concept1")
    public Map hello() {
    	Observable<Quote> getQuote1 = getQuote();
    	Observable<Quote> getQuote2 = getQuote();

        Observable<Map> fullUser = Observable.zip(Arrays.asList(getQuote1, getQuote2), objects -> {
        	Map map = new HashMap();
        	Quote quo1 = (Quote) objects[0];
        	Quote quo2 = (Quote) objects[1];
        	map.put("demo", quo1);
        	map.put("demo2", quo2);

            return map;
        });

        return fullUser.toBlocking().first();
    	
    }
    
    private Observable<Quote> getQuote() {
        return Observable.create((Subscriber<? super Quote> s) -> s.onNext(restClient.getQuote()))
                .onErrorReturn(throwable -> {

                    return new Quote();
                })
                .subscribeOn(Schedulers.computation());
    }
}
