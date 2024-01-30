package com.Louzano.ProjetoBancoLucas.repository;

import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSystemRepository extends JpaRepository<UserSystem, Long> {
}
