package edu.spring.context;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Calculator {

    public Calculator(){
        System.out.println("Constructor");
    }

    public double getCircunference(double diameter, double PI){
        return diameter * PI;
    }

}
