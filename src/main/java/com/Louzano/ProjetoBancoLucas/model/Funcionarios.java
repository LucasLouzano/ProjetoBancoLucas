package com.Louzano.ProjetoBancoLucas.model;


import com.Louzano.ProjetoBancoLucas.enumeration.Sexo;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Funcionarios {
    @Id
    @GeneratedValue
    private Long id;
    private String nomeCompleto;
    private Date nascimento;
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    private String cargo;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
