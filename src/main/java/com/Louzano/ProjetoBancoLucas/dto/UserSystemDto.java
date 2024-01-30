package com.Louzano.ProjetoBancoLucas.dto;

public class UserSystemDto {
    private String name;
    private int documentType;

    public UserSystemDto() {
    }
    public UserSystemDto(UserSystemDto userSystemDto) {
        this.name = userSystemDto.getName();
        this.documentType = userSystemDto.getDocumentType();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDocumentType() {
        return documentType;
    }

    public void setDocumentType(int documentType) {
        this.documentType = documentType;
    }
}
