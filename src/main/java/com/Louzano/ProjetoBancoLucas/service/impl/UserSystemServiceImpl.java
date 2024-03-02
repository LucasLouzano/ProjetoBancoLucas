package com.Louzano.ProjetoBancoLucas.service.impl;
import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.repository.UserSystemRepository;
import com.Louzano.ProjetoBancoLucas.service.UserSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class UserSystemServiceImpl implements UserSystemService {
    @Autowired
    private UserSystemRepository userSystemRepository;

    @Autowired
    private UserSystemMapper userSystemMapper;

    @Override
    public List<UserSystemDto> findAll() {
        return userSystemRepository.findAll()
                .stream()
                .map(userSystemMapper::userSystemToUserSystemDTO)
                .toList();
    }
    @Override
    public UserSystemDto findById(UUID userId) {
        UserSystem userSystem = userSystemRepository.findById(userId).get();
        return userSystemMapper.userSystemToUserSystemDTO(userSystem);
    }

    @Override
    public UserSystemDto save(UserSystem userSystem) {
        if (userSystem != null) {
            UserSystem savedUserSystem = userSystemRepository.save(userSystem);
            return userSystemMapper.userSystemToUserSystemDTO(savedUserSystem);
        }
        return null;
    }
}

