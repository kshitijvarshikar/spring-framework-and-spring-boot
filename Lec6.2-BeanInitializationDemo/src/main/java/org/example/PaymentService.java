package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class PaymentService {
//    private OrderService orderService;

    public PaymentService(){
        System.out.println("PaymentService Created");
    }
    public void pay(){
        System.out.println("PaymentService2 Created");
    }
}
