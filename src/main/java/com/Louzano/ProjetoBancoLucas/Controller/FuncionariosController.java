package com.Louzano.ProjetoBancoLucas.Controller;

import com.Louzano.ProjetoBancoLucas.dto.FuncionariosDTO;
import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import com.Louzano.ProjetoBancoLucas.service.FuncionariosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
public class FuncionariosController {
    @Autowired
    private FuncionariosService funcionariosService;

    @GetMapping("/Funcionarios")
    public FuncionariosDTO getFuncionarioDTO(Long id) {
        return funcionariosService.getFuncionarioDTO(id);
    }
    @GetMapping("/Funcionarios/{id}")
    public Funcionarios search (@PathVariable Long id){
        return funcionariosService.Buscar(id);
    }
    @PostMapping()
    public Funcionarios save(@RequestBody Funcionarios funcionarios){
        return funcionariosService.Salvar(funcionarios);
    }
    @DeleteMapping("/Funcionario/{id}")
    public void delete(@PathVariable Long id){
        funcionariosService.Deletar(id);
    }
}
