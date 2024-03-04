package com.Louzano.ProjetoBancoLucas.controller.response;

public class UserSystemSave {
    private String name;
    private int documentType;

    public UserSystemSave() {
    }

    public UserSystemSave(String name, int documentType) {
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

