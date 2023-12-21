package com.Louzano.ProjetoBancoLucas.service;

import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.repository.UserSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserSystemService {
    @Autowired
    private UserSystemRepository userSystemRepository;


    public UserSystem getUserSystem(UUID userId) {
        return userSystemRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Sistema de usuário não encontrado por id: "));
    }
}