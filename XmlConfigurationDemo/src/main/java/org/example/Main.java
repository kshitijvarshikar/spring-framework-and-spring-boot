package org.example;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        OrderService orderService = context.getBean(OrderService.class);
//        orderService.placedOrder();

//        PaymentService paymentService = context.getBean(PaymentService.class);
//        paymentService.pay();

        UserService user = context.getBean(UserService.class);
        user.user();

        context.close();

    }
}
