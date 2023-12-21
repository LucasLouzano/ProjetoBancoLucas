package com.Louzano.ProjetoBancoLucas;
import  static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class FuncionariosTest {
    @Test
    public void TestModelDto(){

        Funcionarios funcionarios = new Funcionarios();
        LocalDate dataNascimento = LocalDate.of(1990, Month.JUNE, 8);
        funcionarios.setNomeCompleto("Lucas Louzano");
        funcionarios.setNascimento(dataNascimento);
        FuncionariosDTO dto = FuncionariosMapper.CONVERTER.FuncionariotomodelFucionarioDTO(funcionarios);

        assertThat(dto.getNomeCompleto()).isEqualTo("Lucas Louzano");
        assertThat(dto.getNascimento()).isEqualTo(dataNascimento);
    }
}