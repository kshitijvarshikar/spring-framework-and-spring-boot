package com.example.Lecture33_SpringTransactionsDemo.service;

import com.example.Lecture33_SpringTransactionsDemo.entity.Account;
import com.example.Lecture33_SpringTransactionsDemo.entity.TransferRecord;
import com.example.Lecture33_SpringTransactionsDemo.repository.AccountRepository;
import com.example.Lecture33_SpringTransactionsDemo.repository.TransferRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class TransferService {

    private AccountRepository accountRepository;
    private TransferRepository transferRepository;

    public TransferService(AccountRepository accountRepository,
                           TransferRepository transferRepository) {
        this.accountRepository = accountRepository;
        this.transferRepository = transferRepository;
    }

    @Transactional
    public void transfer(Long fromAccountId,
                         Long toAccountId,
                         BigDecimal amount) {

        Account fromAccount = accountRepository.findById(fromAccountId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        Account toAccount = accountRepository.findById(toAccountId)
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        fromAccount.debitAccount(amount);
        accountRepository.saveAndFlush(fromAccount);

        toAccount.creditAccount(amount);
        accountRepository.saveAndFlush(toAccount);

        transferRepository.save(new TransferRecord(
                fromAccountId,
                toAccountId,
                amount,
                LocalDate.now()
        ));

        transferRepository.flush();

        // Testing transaction rollback
//        throw new RuntimeException("Some Error Occured");
    }
}