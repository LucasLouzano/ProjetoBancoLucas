package com.Louzano.ProjetoBancoLucas.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class UserSystemDto {
    private List<TermUserSystemDto> TermUserSystemDtos;


    @Getter
    @Setter
    public static class TermUserSystemDto {
        private UUID codUserSist;
        private String name;
        private int documentType;
        private List<TypeUserSystemDto> typeUserSystemDto;

    }

    @Getter
    @Setter
    public static class TypeUserSystemDto {
        private UUID codAccount;
        private int branch;
        private int account;
    }
}
