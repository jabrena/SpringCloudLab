package edu.spring.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class Example2 {

    public static void main(final String[] args) {
        System.out.println("Hello World");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Example2Configuration.class);
        context.refresh();

        System.out.println(context.getBean(String.class));
    }
}

@Configuration
class Example2Configuration {

    @Bean(name="fruit")
    public String fruit() {
        return "banana";
    }

}
