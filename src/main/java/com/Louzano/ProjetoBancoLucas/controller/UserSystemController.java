package com.Louzano.ProjetoBancoLucas.controller;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
import com.Louzano.ProjetoBancoLucas.service.UserSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserSystemController {
    @Autowired
    private UserSystemService userSystemService;
    @Autowired
    private UserSystemMapper userSystemMapper;

    @GetMapping("/Funcionarios/{userId}")
    public UserSystemDto getFuncionarioDTO(@PathVariable UUID userId) {
        return userSystemMapper.UserSystemToUserSystemDTO(userSystemService.getUserSystem(userId));
    }
}