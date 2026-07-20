package org.example;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class OrderService {

    private final PaymentService paymentService;

    // Proxy
    public OrderService(@Lazy PaymentService paymentService){
        this.paymentService = paymentService;
        System.out.println("OrderService Created");
    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
