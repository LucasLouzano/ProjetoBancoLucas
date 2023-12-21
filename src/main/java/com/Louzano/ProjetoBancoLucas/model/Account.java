package com.Louzano.ProjetoBancoLucas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.UUID;
@Entity
@Getter
@Setter
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private UUID codAccount;
    @Column
    private int branch;
    @Column
    private int account;
}