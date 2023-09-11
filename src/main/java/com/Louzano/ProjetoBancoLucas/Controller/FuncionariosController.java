package com.Louzano.ProjetoBancoLucas.Controller;

import com.Louzano.ProjetoBancoLucas.Entity.Funcionarios;
import com.Louzano.ProjetoBancoLucas.Repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionariosController {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    // vai está retornando uma lista de funcionarios
    @GetMapping("/Funcionarios")
    public List<Funcionarios> listafuncionarios(){
        return funcionariosRepository.findAll();

    }

}
