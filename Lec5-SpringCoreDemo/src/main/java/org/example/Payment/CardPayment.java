package org.example.Payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
// @Qualifier // Qualifer name is same as their class name but is camelCase
//@Qualifier("cp")
public class CardPayment implements PaymentService{

    @Override
    public void pay(){
        System.out.println("Payment Via Card");
    }
}
