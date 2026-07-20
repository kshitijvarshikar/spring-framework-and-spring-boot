package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public OrderService getOrder(){
        return new OrderService();
    }

    @Bean
    public OrderService getOrder2(){
        return new OrderService();
    }
}

//@Bean getOrder() → 1 object
//@Bean getOrder2() → 1 different object
//Total = 2 objects (because there are 2 bean definitions).

// but
// In main(), if you ask Spring for the same bean multiple times, you always get the same object.

