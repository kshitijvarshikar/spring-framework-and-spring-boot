package com.example.Lecture18_ProfileAndYAMLDemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dev", "default", "staging"})

public class DummyNotificationServiceImple implements NotificationService{

    @Override
    public String send() {
        // dummy notification (no real notification)
        return "Here is a Dummy Notification";
    }
}
