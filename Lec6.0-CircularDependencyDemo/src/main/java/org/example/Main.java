package org.example;

import org.example.simple.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Appconfig.class);

        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();

        // infinite creation of A and B
//        A a = new A();
        }
    }
