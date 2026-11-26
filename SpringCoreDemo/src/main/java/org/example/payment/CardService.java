package org.example.payment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cp")
public class CardService implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Pay Via Card");
    }
}
