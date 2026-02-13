package com.example.estoquespring.model;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Movimentacao {
    
    private Long id;
    private String produto;
    private String tipoMovimentacao;
    private int quantidade;
    private LocalDate data;
    private String fornecedor;

}
