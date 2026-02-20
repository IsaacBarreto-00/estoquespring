package com.example.estoquespring.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int qtdeMinima;
    private int qtdeEstoque;
    private String unidadeMedida;
    
    @ManyToOne
    @JoinColumn(name = "id_categoria_fk", nullable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "produto")
    private List<Movimentacao> movimentacoes;

}
