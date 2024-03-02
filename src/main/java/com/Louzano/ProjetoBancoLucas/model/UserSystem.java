package com.Louzano.ProjetoBancoLucas.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class UserSystem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private int documentType;
    @OneToMany
    private Account account;

    public UserSystem() {
    }

    public UserSystem(UserSystem userSystem) {
        this.id = userSystem.getId();
        this.name = userSystem.getName();
        this.documentType = userSystem.getDocumentType();
        this.account = userSystem.getAccount();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

