package com.Louzano.ProjetoBancoLucas.service;

import com.Louzano.ProjetoBancoLucas.model.Account;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountService {
    List<Account> findAll();
    Optional<Account> findByID(UUID id);
    Account save(Account account);
}
