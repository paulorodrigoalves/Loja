package com.example.loja.enums;

public enum CategoriaProduto {
    ELETRONICOS("Eletrônicos"),
    MODA("Moda"),
    ALIMENTOS("Alimentos"),
    BELEZA("Beleza"),
    SAUDE("Saude"),
    CULTURA("Cultura");

    private String nome;
    CategoriaProduto(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
}
