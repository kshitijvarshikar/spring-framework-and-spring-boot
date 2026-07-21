package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

public class Main {
    public static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Lazy Learner Up Now
        OrderService order = context.getBean(OrderService.class);
        order.placeOrder();
//        PaymentService pay = context.getBean(PaymentService.class);
    }
}

/*
ByDefault is Singleton means @eager initialization
OrderService Created
PaymentService Created
*/


/*
Prototype means @Lazy initialization
---------
---------
*/