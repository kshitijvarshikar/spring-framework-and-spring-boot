package com.example.Lecture18_ProfileAndYAMLDemo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")

public class NotificationServiceImple implements NotificationService {

    @Override
    public String send() {
        return "Here is a Notification";
    }
}
