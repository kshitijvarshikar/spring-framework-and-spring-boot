package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        // Means UP IoC Container Using AnnotationConfig and the rules u want, get from AppConfig.class
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        OrderService order = context.getBean(OrderService.class);
//        order.placeOrder();
//        PaymentService payment = context.getBean(PaymentService.class);
//        payment.pay();

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

//        User user = context.getBean(User.class);
//        System.out.println(user.getName());

        }
    }

