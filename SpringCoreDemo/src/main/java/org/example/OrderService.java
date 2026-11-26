package org.example;

import org.example.payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

//    @Autowired
    PaymentService paymentService;

//    @Autowired
//    public OrderService(PaymentService paymentService){
//        this.paymentService = paymentService;
//    }

    @Autowired
    public void setPaymentService(@Qualifier("up") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order-Placed");
    }

}
