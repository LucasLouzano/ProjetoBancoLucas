package com.Louzano.ProjetoBancoLucas.mapper;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDTO;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserSystemMapper {

        UserSystemMapper CONVERTER = Mappers.getMapper(UserSystemMapper.class);

        UserSystemDTO UserSystemToUserSystemDTO(UserSystem userSystem);
}
