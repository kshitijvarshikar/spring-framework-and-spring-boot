package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

@Component
public class OrderService{
//    @Autowired
    private PaymentService paymentService;

    // Default Autowired
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        System.out.println("Order-Placed");
        paymentService.pay();
    }
}

