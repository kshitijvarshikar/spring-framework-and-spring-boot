package org.example;

import org.example.notification.EmailService;
import org.example.notification.FakeEmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new EmailService();
        // type1
        // OrderService order = new OrderService(notificationService);

        // type2
        OrderService order = new OrderService();
        order.setNotification(notificationService);
        order.placeOrder();

        /* type3: field injection, but we talk about Field Injection in upcoming Session*/
    }
}

/* Dependency Injection (DI): A class should ask what it needs and not build everything itself */
/* Inversion Of Control(IoC): IoC is a idea or Principle*/

/* Relation:
Ioc is a idea or principle
DI is approach/Technique to achieve IoC
*/

/* IoC and DI are independent of Spring. They are concepts that can also be implemented in Core Java. */
