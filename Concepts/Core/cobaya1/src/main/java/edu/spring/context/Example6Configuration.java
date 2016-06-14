package edu.spring.context;

import org.springframework.context.annotation.*;

@Configuration
class Example6Configuration {

    @Bean
    @Scope("prototype")
    public IPOJO pojo1() {
        return new POJO1();
    }

    @Bean
    @Scope("prototype")
    @Profile("production")
    @Primary
    public IPOJO pojo2() {
        return new POJO2();
    }
}
