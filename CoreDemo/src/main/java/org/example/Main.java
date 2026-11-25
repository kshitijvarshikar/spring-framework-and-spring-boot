package org.example;

import com.sun.nio.sctp.Notification;
import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static void main() {
        NotificationService notificationService = new EmailService();
        OrderService orderService = new OrderService();

        orderService.setNotificationService(notificationService);
        orderService.placeOrder();
    }
}
