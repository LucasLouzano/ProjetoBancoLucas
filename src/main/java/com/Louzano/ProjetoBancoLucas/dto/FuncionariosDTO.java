package com.Louzano.ProjetoBancoLucas.dto;


import java.time.LocalDate;

public class FuncionariosDTO {
    private String nomeCompleto;
    private LocalDate nascimento;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }
}