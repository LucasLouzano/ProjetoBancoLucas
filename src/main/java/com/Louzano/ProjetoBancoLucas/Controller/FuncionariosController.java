package com.Louzano.ProjetoBancoLucas.Controller;

import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import com.Louzano.ProjetoBancoLucas.service.FuncionariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/funcionario")
public class FuncionariosController {
    @Autowired
    private FuncionariosService funcionariosService;

    // vai está retornando uma lista de funcionarios
    @GetMapping("/Funcionarios")
    public List<Funcionarios> funcionarioslist() {
        return funcionariosService.funcionarioServicoimpl();
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
