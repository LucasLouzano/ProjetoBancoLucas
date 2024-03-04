package com.Louzano.ProjetoBancoLucas.controller;

import com.Louzano.ProjetoBancoLucas.controller.mapper.UserSystemResponseMapper;
import com.Louzano.ProjetoBancoLucas.controller.mapper.UserSystemSaveMapper;
import com.Louzano.ProjetoBancoLucas.controller.mapper.UserSystemUserIdMapper;
import com.Louzano.ProjetoBancoLucas.controller.response.UserSystemResponse;
import com.Louzano.ProjetoBancoLucas.controller.response.UserSystemSave;
import com.Louzano.ProjetoBancoLucas.controller.response.UserSystemUserId;
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
    @Autowired
    private UserSystemResponseMapper response;
    @Autowired
    private UserSystemSaveMapper UserSystemSaveMapper;
    @Autowired
    private UserSystemUserIdMapper userSystemUserIdMapper;

    @GetMapping("/{userId}")
    public ResponseEntity<UserSystemUserId> getUsersDTO(@PathVariable UUID userId) {
        UserSystemDto userSystemDto = service.findById(userId);
        UserSystemUserId userSystemUserId = userSystemUserIdMapper.mapDtoToUserId(userSystemDto);
        if (userSystemUserId == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userSystemUserId);
    }

    @GetMapping
    public ResponseEntity<List<UserSystemResponse>> getAllUserSystem() {
        List<UserSystemDto> usersDto = service.findAll();
        List<UserSystemResponse> userSystemResponse = response.mapDtoToResponse(usersDto);
        if (userSystemResponse.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userSystemResponse);
    }

    @PostMapping
    public ResponseEntity<UserSystemSave> createUser(@RequestBody UserSystem userSystem) {
        UserSystemDto user = service.save(userSystem);
        UserSystemSave userSystemSave = UserSystemSaveMapper.mapDtoToSave(user);
        return new ResponseEntity<>(userSystemSave, HttpStatus.CREATED);
    }
}