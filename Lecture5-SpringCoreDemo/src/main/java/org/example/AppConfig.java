package org.example;

import org.example.Payment.CardPayment;
import org.example.Payment.PaymentService;
import org.example.Payment.UpiPayment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
//@ComponentScan() --> this is also work byDefault, its search inside where the package AppConfig is present.
@ComponentScan("org.example")
public class AppConfig {

    @Bean
    public User createUser(){
        return new User(20, "Kshitij");
    }

    // if we remove all component so alternate way is @Bean, we can use like below way
    @Bean
//    @Primary
    @Qualifier("cp")
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

    @Bean
    @Qualifier("up")
    public PaymentService createUpiPayment(){
        return new UpiPayment();
    }

    @Bean
    public OrderService createOrderService(@Qualifier("up") PaymentService paymentService){
        return new OrderService(paymentService);
    }
}

// If we use both @Component and @Bean --> So priority is @Bean
