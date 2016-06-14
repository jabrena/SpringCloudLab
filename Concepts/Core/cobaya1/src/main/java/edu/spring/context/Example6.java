package edu.spring.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {

    //@Autowired
    //static public IPOJO pojo;

    public static void main(final String[] args) {
        System.out.println("Hello World");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Example6Configuration.class);
        context.getEnvironment().setActiveProfiles("production","pre");
        context.refresh();

        IPOJO pojo = context.getBean(IPOJO.class);
        System.out.println(pojo.method1());
    }
}
