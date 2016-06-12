package edu.spring.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class Example4Configuration {

    @Bean
    public String fruit() {
        return "banana";
    }

    @Bean
    @Primary
    public String fruit2() {
        return "apple";
    }
}
