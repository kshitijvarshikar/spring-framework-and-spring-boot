package com.example.Lecture34_Spring_Transaction_Propagation_Isolation.service;

import com.example.Lecture34_Spring_Transaction_Propagation_Isolation.entity.Order;
import com.example.Lecture34_Spring_Transaction_Propagation_Isolation.entity.PaymentAudit;
import com.example.Lecture34_Spring_Transaction_Propagation_Isolation.repository.PaymentAuditRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PaymentAuditService {

    private PaymentAuditRepository paymentAuditRepository;

    public PaymentAuditService(PaymentAuditRepository paymentAuditRepository) {
        this.paymentAuditRepository = paymentAuditRepository;
    }

    @Transactional(propagation = Propagation.REQUIRED,
            isolation = Isolation.REPEATABLE_READ)
    public void audit(Order order) {
        PaymentAudit paymentAudit = new PaymentAudit(order.getAmount(), order.getId(), true);

        paymentAuditRepository.save(paymentAudit);
    }
}
