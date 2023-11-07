package com.Louzano.ProjetoBancoLucas.Repository;

import com.Louzano.ProjetoBancoLucas.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios,Long> {

}
