package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;


    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        orderDetails();
        System.out.println("Order-Placed");
    }

    public void orderDetails(){
        System.out.println("Order-Details");
    }
}
