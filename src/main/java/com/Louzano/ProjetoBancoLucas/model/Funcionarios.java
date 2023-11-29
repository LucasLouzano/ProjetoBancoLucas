package com.Louzano.ProjetoBancoLucas.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Funcionarios {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    private String nome;

    private  String nomeCompleto;

    private String cargo;

    private Date nascimento;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public Date getNascimento() {
        return nascimento;
    }
    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }
}
