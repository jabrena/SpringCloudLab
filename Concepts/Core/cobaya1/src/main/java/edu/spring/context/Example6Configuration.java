package edu.spring.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

@Configuration
class Example6Configuration {

    @Bean
    @Scope("prototype")
    @Profile("default")
    public IPOJO pojo1() {
        return new POJO1();
    }

    @Bean
    @Scope("prototype")
    @Profile("production")
    public IPOJO pojo2() {
        return new POJO2();
    }
}
