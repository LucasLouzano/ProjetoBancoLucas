package com.Louzano.ProjetoBancoLucas.repository;

import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserSystemRepository extends JpaRepository<UserSystem, UUID> {
}
