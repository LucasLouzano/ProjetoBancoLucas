package com.Louzano.ProjetoBancoLucas.service.impl;

import com.Louzano.ProjetoBancoLucas.model.Account;
import com.Louzano.ProjetoBancoLucas.repository.AccountRepository;
import com.Louzano.ProjetoBancoLucas.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
     public List<Account> findAll(){
         return accountRepository.findAll();
     }

    @Override
    public Optional<Account> findByID(UUID id) {
        Optional<Account> accountOptional = accountRepository.findById(id);
        return accountOptional;
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }
}
