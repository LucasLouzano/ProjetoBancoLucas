package com.Louzano.ProjetoBancoLucas.controller.mapper;

import com.Louzano.ProjetoBancoLucas.controller.response.UserSystemResponse;
import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserSystemResponseMapper {
    UserSystemResponseMapper INSTANCE = Mappers.getMapper(UserSystemResponseMapper.class);

    UserSystemResponse mapDtoToResponse(UserSystemDto userSystemDto);
   List<UserSystemResponse> mapDtoToResponse(List<UserSystemDto> userSystemDto);
}


