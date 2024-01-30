package com.Louzano.ProjetoBancoLucas.service;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.repository.UserSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSystemService {
    @Autowired
    private UserSystemRepository userSystemRepository;

    public List<UserSystem> findAll() {
        return userSystemRepository.findAll();
    }


    public UserSystem findById(Long userId) {
        return userSystemRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Sistema de usuário não encontrado por id: "));
    }

    public UserSystem save(UserSystem userSystem) {
        if (userSystem != null) {
            this.userSystemRepository.save(userSystem);
        }
        return userSystem;
    }

}