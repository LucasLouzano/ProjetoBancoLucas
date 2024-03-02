//package com.Louzano.ProjetoBancoLucas.controller;
//
//import com.Louzano.ProjetoBancoLucas.dto.UserSystemDto;
//import com.Louzano.ProjetoBancoLucas.mapper.UserSystemMapper;
//import com.Louzano.ProjetoBancoLucas.model.UserSystem;
//import com.Louzano.ProjetoBancoLucas.service.impl.UserSystemServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.http.ResponseEntity;
//import java.util.List;
//
//import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
//import static org.junit.Assert.assertEquals;
//import static org.mockito.Mockito.*;
//
//@ExtendWith(MockitoExtension.class)
//public class UserSystemControllerTest {
//    @InjectMocks
//    private UserSystemController controller;
//    @Mock
//    private UserSystemServiceImpl service;
//    @Mock
//    private UserSystemMapper userSystemMapper;
//
//    @Before
//    public void setUp() {
//        MockitoAnnotations.openMocks(this);
//    }
//
//    @Test
//    public void testGetUsersDTO() {
//        var userSystemDto = new UserSystemDto();
//        userSystemDto.setName("Lucas");
//        userSystemDto.setDocumentType(12);
//        when(service.findById(any())).thenReturn(userSystemDto);
//
//
//        UserSystemDto usersDTO = new UserSystemDto();
//        usersDTO.setName("Lucas");
//        usersDTO.setDocumentType(12);
//        when(userSystemMapper.userSystemToUserSystemDTO(any())).thenReturn(usersDTO);
//        ResponseEntity<UserSystemDto> response = controller.getUsersDTO(1L);
//
//        assertNotNull(response.getBody());
//        assertEquals(UserSystemDto.class, response.getBody().getClass());
//        assertEquals("Lucas", response.getBody().getName());
//        assertEquals(12, response.getBody().getDocumentType());
//        verify(service, times(1)).findById(1L);
//    }
//
//    @Test
//    public void getUserDto() {
//        UserSystemDto userDto = new UserSystemDto();
//        userDto.setName("Lucas");
//        userDto.setDocumentType(12);
//        when(service.findAll()).thenReturn(List.of(userDto));
//
//
//        when(userSystemMapper.userSystemToUserSystemDTO(any())).thenReturn(userDto);
//
//        List<UserSystemDto> response = controller.getUserDto().getBody();
//
//
//        assertNotNull(response);
//
//        assertEquals(1, response.size());
//
//        verify(service, times(1)).findAll();
//    }
//
//
//    @Test
//   public void saveUsers() {
//        UserSystemDto userSystem = new UserSystemDto();
//        userSystem.setName("Lucas");
//        userSystem.setDocumentType(12);
//        when(service.save(any())).thenReturn(userSystem);
//
//        UserSystemDto userSystemDto = new UserSystemDto();
//        userSystemDto.setName("felipe");
//        userSystemDto.setDocumentType(10);
//        when(userSystemMapper.userSystemToUserSystemDTO(any())).thenReturn(userSystemDto);
//
//        ResponseEntity<UserSystemDto> response = controller.saveUsers(new UserSystem());
//        assertNotNull(response);
//        assertEquals(ResponseEntity.ok().build(), response);
//
//        verify(service, times(1)).save(any());
//    }
//}