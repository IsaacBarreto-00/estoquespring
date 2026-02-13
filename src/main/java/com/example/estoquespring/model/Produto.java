package com.example.estoquespring.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Produto {
    
    private String nome;
    private Long id;
    private String categoria;
    private int qtdeMinima;
    private int qtdeEstoque;
    private String unidadeMedida;

}
