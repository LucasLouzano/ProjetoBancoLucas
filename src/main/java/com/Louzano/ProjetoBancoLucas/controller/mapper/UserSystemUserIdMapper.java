package com.Louzano.ProjetoBancoLucas.controller.mapper;
import com.Louzano.ProjetoBancoLucas.controller.response.UserSystemUserId;
import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserSystemUserIdMapper {
    UserSystemUserIdMapper USERID = Mappers.getMapper(UserSystemUserIdMapper.class);

    UserSystemUserId mapDtoToUserId(UserSystemDto userSystemDto);
}

