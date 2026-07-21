package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

public class Main {
    public static void main() {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); // to use disposableBean

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();

//        AppConfig config = context.getBean(AppConfig.class);
//        config.demo();

//        UserService user = context.getBean(UserService.class);

        CartService cart = context.getBean(CartService.class);
        System.out.println(cart.getValue(1));

        // to use this --> ConfigurableApplicationContext
        context.close();
    }
}
