package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // BeanScope
//        OrderService order = context.getBean(OrderService.class);
//        OrderService order2 = context.getBean(OrderService.class);
//        System.out.println(order==order2);

        // BeanScope 2 Types
        // 1) Singleton: Whether you use getBean() or Dependency Injection (DI), only one object (bean) is created.
        // (ByDefault Every Class Scope is Singleton, No need to use @Singleton)

        // 2) Prototype: Whether you use getBean() or Dependency Injection (DI), two object (bean) is created. (Opposite of Singleton)
        // (You have to use @Prototype)


//        Singleton --> Eager Initialization
//        Prototype --> Lazy Initialization
    }
}
