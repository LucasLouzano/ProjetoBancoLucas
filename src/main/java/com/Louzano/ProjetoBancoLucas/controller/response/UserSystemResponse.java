package com.Louzano.ProjetoBancoLucas.controller.response;

public class UserSystemResponse {
    private String name;
    private int documentType;

    public UserSystemResponse() {
    }

    public UserSystemResponse(String name, int documentType) {
        this.name = name;
        this.documentType = documentType;
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


