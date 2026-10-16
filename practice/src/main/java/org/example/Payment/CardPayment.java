package org.example.Payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CardPayment implements PaymentService {
    @Override
    public void pay() {
        System.out.println("Card Payment is Done");
    }
}
