package com.Louzano.ProjetoBancoLucas.model;

import jakarta.persistence.Entity;

import java.util.UUID;
@Entity
public class Account {
    private UUID codAccount;
    private int branch;
    private int account;

    public UUID getCodAccount() {
        return codAccount;
    }
    public void setCodAccount(UUID codAccount) {
        this.codAccount = codAccount;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }
}
