package com.example.estoquespring.repository;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.estoquespring.EstoquespringApplication;
import com.example.estoquespring.model.Fornecedor;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    
}
