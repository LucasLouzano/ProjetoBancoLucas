package com.Louzano.ProjetoBancoLucas.service;

import com.Louzano.ProjetoBancoLucas.dto.FuncionariosDTO;
import com.Louzano.ProjetoBancoLucas.mapper.FuncionariosMapper;
import com.Louzano.ProjetoBancoLucas.repository.FuncionariosRepository;
import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionariosService {
    @Autowired
    private FuncionariosRepository funcionariosRepository;
    @Autowired
    private FuncionariosMapper funcionariosMapper;

    public FuncionariosDTO getFuncionarioDTO(Long id) {
        Funcionarios funcionarios = funcionariosRepository.findById(id).get();
        return funcionariosMapper.FuncionariotomodelFucionarioDTO(funcionarios);
    }
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

