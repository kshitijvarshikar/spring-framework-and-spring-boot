package com.example.Lecture33_SpringTransactionsDemo.repository;

import com.example.Lecture33_SpringTransactionsDemo.entity.TransferRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<TransferRecord, Long> {
}
