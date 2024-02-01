package com.Louzano.ProjetoBancoLucas.service;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;

import java.util.List;

public interface UserSystemService {
    List<UserSystemDto> findAll();
    UserSystemDto findById(Long userId);
    UserSystemDto save(UserSystem userSystem);
}
