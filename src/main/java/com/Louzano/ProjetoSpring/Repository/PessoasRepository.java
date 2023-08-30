package com.Louzano.ProjetoSpring.Repository;

import com.Louzano.ProjetoSpring.Model.Pessoas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoasRepository extends JpaRepository<Pessoas,Long> {

}
