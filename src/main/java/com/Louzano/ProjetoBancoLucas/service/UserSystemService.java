package com.Louzano.ProjetoBancoLucas.service;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDTO;
import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.repository.UserSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserSystemService {
    @Autowired
    private UserSystemRepository userSystemRepository;
    @Autowired
    private UserSystemMapper userSystemMapper;

    public UserSystemDTO getUserAccount(UUID userId) {
        UserSystem userSystem = userSystemRepository.findById(userId).get();
        if (userSystem == null) {
        }
        return userSystemMapper.UserSystemToUserSystemDTO(userSystem);
    }
}
