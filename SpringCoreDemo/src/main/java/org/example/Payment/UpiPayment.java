package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
// @Primary // If have 2 choice priority this where primary is applicable
//@Qualifier("up")
public class UpiPayment implements PaymentService{

    @Override
    public void pay(){
        System.out.println("Payment By UPI");
    }
}
