package com.example.Lecture33_SpringTransactionsDemo.repository;

import com.example.Lecture33_SpringTransactionsDemo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
