package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("up")
public class UpiService implements PaymentService{

    @Override
    public void pay() {
        System.out.println("Pay Via Upi");
    }
}
