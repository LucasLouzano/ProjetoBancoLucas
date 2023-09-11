package com.Louzano.ProjetoSpring.Repository;

import com.Louzano.ProjetoSpring.Entity.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionariosRepository extends JpaRepository<Funcionarios,Long> {
}
