package com.Louzano.ProjetoBancoLucas.controller;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.service.UserSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserSystemController {
    @Autowired
    private UserSystemService service;
    @Autowired
    private UserSystemMapper userSystemMapper;

    @GetMapping("/{userId}")
    public UserSystemDto getUsersDTO(@PathVariable Long userId) {
        UserSystem userSystem = this.service.findById(userId);
        return userSystemMapper.userSystemToUserSystemDTO(userSystem);
    }

    @GetMapping
    public List<UserSystemDto> getUserDto() {
        return service.findAll()
                .stream()
                .map(userSystemMapper::userSystemToUserSystemDTO)
                .collect(Collectors.toList());
    }
    @PostMapping
    public ResponseEntity<UserSystemDto> saveUsers(@RequestBody  UserSystem userSystem) {
        this.userSystemMapper.userSystemToUserSystemDTO(service.save(userSystem));
        return ResponseEntity.ok().build();
    }
}
