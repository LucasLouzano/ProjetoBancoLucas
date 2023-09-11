package com.Louzano.ProjetoBancoLucas.Entity;


import jakarta.persistence.*;

@Entity
public class Funcionarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String nome;
    @Column
    private Integer numerosIndentificacao;
    @Column
    private String cargo;
    @Column
    private Integer idade;

    public Funcionarios(Long id, String nome, Integer numerosIndentificacao, String cargo, Integer idade) {
        this.id = id;
        this.nome = nome;
        this.numerosIndentificacao = numerosIndentificacao;
        this.cargo = cargo;
        this.idade = idade;
    }

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

    public void setNumerosIndentificacao(Integer numerosIndentificacao) {
        this.numerosIndentificacao = numerosIndentificacao;
    }

    public Integer getNumeroIndentificacao() {
        return numerosIndentificacao;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }
}
