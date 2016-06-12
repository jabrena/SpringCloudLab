package edu.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {

    public static void main(final String[] args) {
        System.out.println("Hello World");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Example4Configuration.class);
        context.refresh();
        System.out.println(context.getBean(String.class));
        System.out.println(context.getBean("fruit"));
    }
}
