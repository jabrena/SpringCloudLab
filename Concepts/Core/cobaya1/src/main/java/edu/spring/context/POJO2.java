package edu.spring.context;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by jabrena on 12/6/16.
 */
public class POJO2 implements IPOJO {

    public POJO2(){
        System.out.println("Constructor");
    }

    public String method1(){
        return "demoPRO";
    }

    @PostConstruct
    public void init(){
        System.out.println("Start");
    }

    @PreDestroy
    public void finish(){
        System.out.println("End");
    }
}
