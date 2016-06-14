package edu.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Exercise1 {

    public static void main(final String[] args) {
        System.out.println("Hello World");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Exercise1Configuration.class);
        //context.getEnvironment().setActiveProfiles("production", "pre");
        context.refresh();

        Calculator cal = context.getBean(Calculator.class);
        IPi pi = context.getBean(IPi.class);
        System.out.println(pi.getPi());
        System.out.println(cal.getCircunference(pi.getPi(), 3));
    }
}
