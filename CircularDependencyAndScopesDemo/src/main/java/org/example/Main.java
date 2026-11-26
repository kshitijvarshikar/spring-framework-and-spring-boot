package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

      OrderService orderService1 = context.getBean(OrderService.class);
      orderService1.placeOrder();

        OrderService orderService2 = context.getBean(OrderService.class);
        orderService2.placeOrder();

        System.out.println(orderService1 == orderService2);
    }
}
