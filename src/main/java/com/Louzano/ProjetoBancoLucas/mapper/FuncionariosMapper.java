package com.Louzano.ProjetoBancoLucas.mapper;

import com.Louzano.ProjetoBancoLucas.dto.FuncionariosDTO;
import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

@Mapper
public interface FuncionariosMapper {
    FuncionariosMapper CONVERTER = Mappers.getMapper(FuncionariosMapper.class);

    FuncionariosDTO FuncionariotomodelFucionarioDTO(Funcionarios funcionarios);

}


//   @Mapping(source = "nomeCompleto", target = "nomeCompleto")
//  @Mapping(source = "nascimento", target = "nascimento")