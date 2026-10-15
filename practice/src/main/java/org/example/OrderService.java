package org.example;

import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SmsService;

public class OrderService {

    NotificationService notificationService;

    public OrderService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
//    public OrderService() {
//    }

    public void placeOrder() {
        System.out.println("Placed Order");
        notificationService.sendNotification();
    }
//
//    public void setNotificationService(NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }
}
