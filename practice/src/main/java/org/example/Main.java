package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.orderPlaced();

        User user = context.getBean(User.class);
        System.out.println(user.getName());

    }
}

