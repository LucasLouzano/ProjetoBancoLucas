package com.Louzano.ProjetoBancoLucas.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private int agency;
    private int account;
    @OneToMany
    private List<UserSystem> userSystem;

    public Account() {
    }

    public Account(Account account) {
        this.id = account.getId();
        this.agency = account.getAgency();
        this.account = account.getAccount();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public List<UserSystem> getUserSystem() {
        return userSystem;
    }

    public void setUserSystem(List<UserSystem> userSystem) {
        this.userSystem = userSystem;
    }
}