package com.Louzano.ProjetoBancoLucas.controller.mapper;
import com.Louzano.ProjetoBancoLucas.controller.response.UserSystemSave;
import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserSystemSaveMapper {
    UserSystemSaveMapper SAVE = Mappers.getMapper(UserSystemSaveMapper.class);

    UserSystemSave mapDtoToSave(UserSystemDto userSystemDto);
}

