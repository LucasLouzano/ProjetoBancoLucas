package com.Louzano.ProjetoBancoLucas.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class AccountDTO {
    private UUID codAccount;
    private int branch;
    private int account;
}
