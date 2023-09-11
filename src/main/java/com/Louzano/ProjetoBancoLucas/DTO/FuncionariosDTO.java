package com.Louzano.ProjetoBancoLucas.DTO;

import com.Louzano.ProjetoBancoLucas.Entity.Funcionarios;

import java.util.List;
import java.util.stream.Collectors;

public class FuncionariosDTO {
    private String nome;
    private Integer numerosIndentificacao;
    private String cargo;
    private Integer idade;

    public FuncionariosDTO(Funcionarios funcionarios) {
        this.nome = funcionarios.getNome();
        this.numerosIndentificacao = funcionarios.getNumeroIndentificacao();
        this.cargo = funcionarios.getCargo();
        this.idade = funcionarios.getIdade();
    }
    public static List<FuncionariosDTO> converter
                  (List<Funcionarios> funcionarios){
        return funcionarios.stream()
                .map(FuncionariosDTO::new).collect(Collectors.toList());
    }
}
