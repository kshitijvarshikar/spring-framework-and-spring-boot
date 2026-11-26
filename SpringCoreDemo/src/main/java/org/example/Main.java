package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.pay();

//        User user = context.getBean(User.class);
//        System.out.println(user.getName());
    }
}
