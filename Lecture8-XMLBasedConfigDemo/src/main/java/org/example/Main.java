package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

        // 1) get bean by id/name
//        OrderService order = (OrderService) context.getBean("orderService");

        // 2) get bean by type
        // its only work when we have unique bean, if we 2 same bean so it's not working
//        OrderService order = context.getBean(OrderService.class);

        // 3) get bean by id/type --> best way
//        OrderService order =
//                context.getBean("orderService", OrderService.class);
//        order.placeOrder();

//        PaymentService paymentService =
//                context.getBean("paymentService", PaymentService.class);
//        paymentService.pay();

        UserService userService = context.getBean(UserService.class);
//        System.out.println(userService.getUsernames());

        context.close();
    }
}



