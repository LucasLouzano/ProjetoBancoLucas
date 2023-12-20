package com.Louzano.ProjetoBancoLucas.dto;

import com.Louzano.ProjetoBancoLucas.model.Account;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.UUID;
@NotBlank
@NotNull
public class UserSystemDTO {
    private UUID codUserSist;
    private String name;
    private int documentType;
    private List<Account> account;

    public UUID getCodUserSist() {
        return codUserSist;
    }

    public void setCodUserSist(UUID codUserSist) {
        this.codUserSist = codUserSist;
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

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }
}
