package com.Louzano.ProjetoBancoLucas.dto;


import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserSystemDto extends AccountDTO {
        private UUID codUserSist;
        private String name;
        private int documentType;

    }
