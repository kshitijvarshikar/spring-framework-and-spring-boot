package org.example;

import org.example.notification.FakeEmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SmsService;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new SmsService();

        OrderService order = new OrderService(notificationService);
//
//        order.setNotificationService(notificationService);
        order.placeOrder();

    }
}


