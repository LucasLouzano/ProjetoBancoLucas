package com.Louzano.FuncionáriosdoBancoLucas.Repository;

import com.Louzano.FuncionáriosdoBancoLucas.Entity.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios,Long> {

}
