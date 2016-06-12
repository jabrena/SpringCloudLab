package edu.spring.context;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class POJO1 implements IPOJO{

    public POJO1(){
        System.out.println("Constructor");
    }

    public String method1(){
        return "demoCERT";
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
