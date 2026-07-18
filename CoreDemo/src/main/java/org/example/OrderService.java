package org.example;

import org.example.notification.EmailService;
import org.example.notification.NotificationService;
import org.example.notification.PopUpNotificationService;
import org.example.notification.SmsService;

public class OrderService {
    NotificationService notification ;

    // DI type 1: Using Constructor
    public OrderService(NotificationService notification){
        this.notification = notification;
    }

    public OrderService(){};

    public void placeOrder(){
        System.out.println("Order Placed");
        notification.sendNotification();
    }

    // DI type 2: Using Setters
    public void setNotification(NotificationService notification) {
        this.notification = notification;
    }
}
