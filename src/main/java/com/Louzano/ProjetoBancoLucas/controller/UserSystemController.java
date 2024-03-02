package com.Louzano.ProjetoBancoLucas.controller;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.service.impl.UserSystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserSystemController {
    @Autowired
    private UserSystemServiceImpl service;

    @GetMapping("/{userId}")
    public ResponseEntity<UserSystemDto> getUsersDTO(@PathVariable UUID userId) {
        UserSystemDto userSystemDto = service.findById(userId);
        if (userSystemDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userSystemDto);
    }
    @GetMapping
    public ResponseEntity<List<UserSystemDto>> getAllUserSystem(){
        List<UserSystemDto> usersDto = service.findAll();
        if (usersDto.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usersDto);
    }

    @PostMapping
    public ResponseEntity<UserSystemDto> createUser(@RequestBody UserSystem userSystem) {
        UserSystemDto user = service.save(userSystem);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}