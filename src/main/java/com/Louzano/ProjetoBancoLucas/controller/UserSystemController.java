package com.Louzano.ProjetoBancoLucas.controller;

import com.Louzano.ProjetoBancoLucas.dto.FuncionariosDTO;
import com.Louzano.ProjetoBancoLucas.dto.UserSystemDTO;
import com.Louzano.ProjetoBancoLucas.service.UserSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/user")
public class UserSystemController {
    @Autowired
    private UserSystemService userSystemService;

    @GetMapping("/Funcionarios")
    public  UserSystemDTO getFuncionarioDTO(@PathVariable UUID userId) {
        return userSystemService.getUserAccount(userId);
    }
}
