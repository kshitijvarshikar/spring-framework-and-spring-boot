package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    @Autowired
//    @Lazy
    private OrderService orderService;
//
//    public PaymentService(OrderService orderService){
//        this.orderService = orderService;
//    }

//
//    @Autowired
//    public void setOrderService(OrderService orderService) {
//        this.orderService = orderService;
//    }

    public void pay() {
        System.out.println("Payment-Done");
        //        orderService.orderDetails();
    }
}
