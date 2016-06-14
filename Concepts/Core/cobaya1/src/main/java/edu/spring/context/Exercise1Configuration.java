package edu.spring.context;

import org.springframework.context.annotation.*;

@Configuration
class Exercise1Configuration {

    @Bean
    @Scope("singleton")
    @Profile("default")
    public IPi pi1() {
        return new PiImplementation1();
    }

    @Bean
    @Scope("singleton")
    @Profile("production")
    public IPi pi2() {
        return new PiImplementation2();
    }

    @Bean
    @Scope("prototype")
    public Calculator calc() {
        return new Calculator();
    }
}
