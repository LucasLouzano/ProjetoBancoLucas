package com.Louzano.ProjetoBancoLucas.Config;

import com.Louzano.ProjetoBancoLucas.controller.mapper.UserSystemResponseMapper;
import com.Louzano.ProjetoBancoLucas.controller.mapper.UserSystemSaveMapper;
import com.Louzano.ProjetoBancoLucas.controller.mapper.UserSystemUserIdMapper;
import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserSystemMapper userSystemMapper() {
        return Mappers.getMapper(UserSystemMapper.class);
    }

    @Bean
    public UserSystemResponseMapper userSystemResponseMapper() {
        return UserSystemResponseMapper.INSTANCE;
    }

    @Bean
    public UserSystemSaveMapper userSystemSaveMapper() {
        return UserSystemSaveMapper.SAVE;
    }

    @Bean
    public UserSystemUserIdMapper userSystemUserIdMapper() {
        return UserSystemUserIdMapper.USERID;
    }
}

