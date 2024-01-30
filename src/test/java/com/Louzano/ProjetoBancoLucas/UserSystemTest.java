package com.Louzano.ProjetoBancoLucas;

import com.Louzano.ProjetoBancoLucas.controller.UserSystemController;
import com.Louzano.ProjetoBancoLucas.model.UserSystem;
import com.Louzano.ProjetoBancoLucas.repository.UserSystemRepository;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class UserSystemTest {
    @InjectMocks
    private UserSystemController controller;
    @Mock
    private UserSystemRepository repository;
    @Test
    public void TestModelDto() {

        UserSystem userSystem = new UserSystem();
        userSystem.setName("Lucas");
        userSystem.setDocumentType(12);


    }
}