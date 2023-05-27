package com.example.loja.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_ESTABELECIMENTO")
public class Estabelecimento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "varbinary(36)")
    private UUID id;
    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;

    private String nomeFantasia;
    private String nomeSocial;
    private String cnpj;
    private Endereco endereco;

}
