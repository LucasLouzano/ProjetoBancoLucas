//package com.Louzano.ProjetoBancoLucas.model;
//
//import jakarta.persistence.*;
//
//@Entity
//public class Account {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private int branch;
//    private int account;
//    public Account() {
//    }
//
//    public Account(int branch, int account) {
//        this.branch = branch;
//        this.account = account;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public int getBranch() {
//        return branch;
//    }
//
//    public void setBranch(int branch) {
//        this.branch = branch;
//    }
//
//    public int getAccount() {
//        return account;
//    }
//
//    public void setAccount(int account) {
//        this.account = account;
//    }
//}