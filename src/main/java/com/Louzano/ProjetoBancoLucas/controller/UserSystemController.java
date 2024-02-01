package com.Louzano.ProjetoBancoLucas.controller;

import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.service.impl.UserSystemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserSystemController {
    @Autowired
    private UserSystemServiceImpl service;
    @Autowired
    private UserSystemMapper userSystemMapper;

    @GetMapping("/{userId}")
    public ResponseEntity<UserSystemDto> getUsersDTO(@PathVariable Long userId) {
        UserSystemDto userSystemDto = service.findById(userId);
        if (userSystemDto == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(userSystemDto);
    }

    @GetMapping
    public ResponseEntity<List<UserSystemDto>> getUserDto() {
        List<UserSystemDto> usersDto = service.findAll();
        if (usersDto.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(usersDto);
    }

    @PostMapping
    public ResponseEntity<UserSystemDto> saveUsers(@RequestBody UserSystem userSystem) {
        UserSystemDto usersDto = service.save(userSystem);
        if (usersDto != null) {
            return ResponseEntity.ok(usersDto);
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}


//    @PostMapping
//    public ResponseEntity<UserSystemDto> saveUsers(@RequestBody UserSystem userSystem) {
//        UserSystem savedUserSystem = userService.save(userSystem);
//
//        if (savedUserSystem != null) {
//            UserSystemDto userSystemDto = userSystemMapper.userSystemToUserSystemDTO(savedUserSystem);
//            return ResponseEntity.ok(userSystemDto);
//        } else {
//            // Pode ajustar conforme necessário, por exemplo, retornar um ResponseEntity com erro
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }
//}