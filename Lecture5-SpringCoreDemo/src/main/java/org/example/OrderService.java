package org.example;

import org.example.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

//    @Autowired // Dependency Injected type3 using field injection but not recommended
    private PaymentService paymentService;

    @Autowired // Dependency Injected type1 using constructor Most recommended
    // if we don't use Autowired, byDefault System Used Autowired For one constructor
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

//    @Autowired // Dependency Injected type2 using setters
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
