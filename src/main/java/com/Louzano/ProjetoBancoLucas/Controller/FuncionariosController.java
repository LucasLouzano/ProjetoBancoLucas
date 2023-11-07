package com.Louzano.ProjetoBancoLucas.Controller;

import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import com.Louzano.ProjetoBancoLucas.Repository.FuncionariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FuncionariosController {
    @Autowired
    private FuncionariosRepository funcionariosRepository;

    // vai está retornando uma lista de funcionarios
    @GetMapping("/Funcionarios")
    public List<Funcionarios> listafuncionarios() {
        return funcionariosRepository.findAll();
    }
    @GetMapping("/Funcionarios/{id}")
    public Funcionarios getFuncionarios(@PathVariable Long id){
        return funcionariosRepository.getReferenceById(id);
    }
    @PostMapping("/Funcionarios")
    public Funcionarios saveFuncionarios(@RequestBody Funcionarios funcionarios){
        return funcionariosRepository.save(funcionarios);
    }
    @DeleteMapping("/Funcionario/{id}")
    public void deleteFuncionarios(@PathVariable Long id){
        funcionariosRepository.deleteById(id);
    }
}
