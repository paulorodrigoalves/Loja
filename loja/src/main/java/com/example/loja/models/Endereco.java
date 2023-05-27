package com.example.loja.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TB_ENDERECO")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "varbinary(36)")
    private UUID id;
    private String nome;
    private String descricao;
    private Double preco;
    private String categoria;

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

}
