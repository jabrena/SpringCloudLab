package edu.spring.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class Example3Configuration {

    @Bean
    public String fruit() {
        return "banana";
    }
}
