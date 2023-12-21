package com.Louzano.ProjetoBancoLucas.mapper;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserSystemMapper {

        UserSystemMapper CONVERTER = Mappers.getMapper(UserSystemMapper.class);

        UserSystemDto UserSystemToUserSystemDTO(UserSystem userSystem);
}


//   @Mapping(source = "nomeCompleto", target = "nomeCompleto")
//  @Mapping(source = "nascimento", target = "nascimento")