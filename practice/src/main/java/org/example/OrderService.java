package org.example;

import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    PaymentService paymentService;

//    public OrderService(@Qualifier("up") PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }


    @Autowired
    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void orderPlaced() {
        paymentService.pay();
        System.out.println("Order-Placed");
    }
}
