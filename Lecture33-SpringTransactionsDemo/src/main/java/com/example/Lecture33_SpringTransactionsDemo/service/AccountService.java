package com.example.Lecture33_SpringTransactionsDemo.service;

import com.example.Lecture33_SpringTransactionsDemo.entity.Account;
import com.example.Lecture33_SpringTransactionsDemo.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Account account) {
        accountRepository.save(account);
    }
}
