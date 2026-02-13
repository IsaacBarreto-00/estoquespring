package com.example.estoquespring.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Fornecedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(length = 15)
    private String cnpj;
    @Column(length = 11)
    private String telefone;
    private String email;

}
