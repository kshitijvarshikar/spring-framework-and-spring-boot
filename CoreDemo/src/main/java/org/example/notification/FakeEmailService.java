package org.example.notification;

public class FakeEmailService implements NotificationService{

    @Override
    public void sendNotification(){
        System.out.println("Fake Email Send");
    }
}
