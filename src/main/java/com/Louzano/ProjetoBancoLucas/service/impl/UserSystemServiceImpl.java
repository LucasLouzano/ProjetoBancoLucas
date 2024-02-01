package com.Louzano.ProjetoBancoLucas.service.impl;
import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.repository.UserSystemRepository;
import com.Louzano.ProjetoBancoLucas.service.UserSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserSystemServiceImpl implements UserSystemService {
    @Autowired
    private UserSystemRepository userSystemRepository;

    @Autowired
    private UserSystemMapper userSystemMapper;

    public List<UserSystemDto> findAll() {
        return userSystemRepository.findAll()
                .stream()
                .map(userSystemMapper::userSystemToUserSystemDTO)
                .collect(Collectors.toList());
    }

    public UserSystemDto findById(Long userId) {
        UserSystem userSystem = userSystemRepository.findById(userId).get();
        UserSystemDto usersDto = userSystemMapper.userSystemToUserSystemDTO(userSystem);
        return usersDto;
    }

    public UserSystemDto save(UserSystem userSystem) {
        if (userSystem != null) {
            UserSystem savedUserSystem = userSystemRepository.save(userSystem);
            return userSystemMapper.userSystemToUserSystemDTO(savedUserSystem);
        }
        return null;
    }
}


