package com.example.Lecture34_Spring_Transaction_Propagation_Isolation.repository;

import com.example.Lecture34_Spring_Transaction_Propagation_Isolation.entity.PaymentAudit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentAuditRepository extends JpaRepository<PaymentAudit, Long> {
}
