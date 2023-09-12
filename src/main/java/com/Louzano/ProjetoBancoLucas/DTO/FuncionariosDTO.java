package com.Louzano.ProjetoBancoLucas.DTO;


public class FuncionariosDTO {
    private String nome;
    private Integer numerosIndentificacao;
    private String cargo;
    private Integer idade;

    public FuncionariosDTO(String nome, Integer numerosIndentificacao, String cargo, Integer idade) {
        this.nome = nome;
        this.numerosIndentificacao = numerosIndentificacao;
        this.cargo = cargo;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumerosIndentificacao() {
        return numerosIndentificacao;
    }

    public void setNumerosIndentificacao(Integer numerosIndentificacao) {
        this.numerosIndentificacao = numerosIndentificacao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}