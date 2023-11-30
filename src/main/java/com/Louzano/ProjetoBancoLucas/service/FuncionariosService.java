package com.Louzano.ProjetoBancoLucas.service;

import com.Louzano.ProjetoBancoLucas.Repository.FuncionariosRepository;
import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionariosService {
    @Autowired
    private FuncionariosRepository funcionariosRepository;
    public List<Funcionarios> funcionarioServicoimpl() {
        return funcionariosRepository.findAll();
    }
    public Funcionarios Buscar(Long id) {
        return funcionariosRepository.getReferenceById(id);
    }
    public Funcionarios Salvar(Funcionarios funcionarios) {
        return funcionariosRepository.save(funcionarios);

    }
    public void Deletar(Long id) {
        funcionariosRepository.deleteById(id);
    }
}

