package com.Louzano.ProjetoBancoLucas.controller;

import com.Louzano.ProjetoBancoLucas.model.Account;
import com.Louzano.ProjetoBancoLucas.service.impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountService;
    @GetMapping
    public ResponseEntity <List<Account>> getAllAccount(){
       List<Account> account = accountService.findAll();
        return ResponseEntity.ok().body(account);

    }
}
