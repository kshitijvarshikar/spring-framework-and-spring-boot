package com.example.Lecture2_first_spring_boot_application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayhello() {
        return "Hello World";
    }

    @GetMapping("/bye")
    public String saybye() {
        return "Bye Bye!!!";
    }
    @GetMapping("/namaste")
    public String greetings() {
        return "Namaste";
    }


}
