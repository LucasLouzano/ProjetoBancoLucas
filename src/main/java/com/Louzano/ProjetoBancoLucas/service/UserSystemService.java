package com.Louzano.ProjetoBancoLucas.service;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;

import java.util.List;
import java.util.UUID;

public interface UserSystemService {
    List<UserSystemDto> findAll();
    UserSystemDto findById(UUID userId);
    UserSystemDto save(UserSystem userSystem);
}
