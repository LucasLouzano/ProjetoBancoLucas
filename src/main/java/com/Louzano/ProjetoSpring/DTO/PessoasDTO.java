package com.Louzano.ProjetoSpring.DTO;

import jakarta.persistence.Column;

public class PessoasDTO {
    @Column
    private String nome;
    @Column
    private String sobrenome;
    @Column
    private Integer idade;

    public PessoasDTO(String nome, String sobrenome, Integer idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
