package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class OrderService {

    public OrderService() {
        System.out.println("Service is Eager Initialization Process");
    }

    public void placeOrder(){
        System.out.println("Order-Placed");
    }

}
