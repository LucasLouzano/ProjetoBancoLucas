package com.Louzano.ProjetoBancoLucas.dto;

import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ConverterFuncionariosDto {
    ConverterFuncionariosDto CONVERTER = Mappers.getMapper(ConverterFuncionariosDto.class);

    @Mapping(source = "nomeCompleto", target = "nomeCompleto")
    @Mapping(source = "nascimento", target = "nascimento")
    Funcionarios getmodel(FuncionariosDTO funcionariosDTO); // Adiciona FuncionariosDTO como parâmetro
    @Mapping(source = "nomeCompleto", target = "nomeCompleto")
    @Mapping(source = "nascimento", target = "nascimento")
    FuncionariosDTO getDTO(Funcionarios funcionarios); // Adiciona Funcionarios como parâmetro

}
