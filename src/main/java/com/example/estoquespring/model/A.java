package com.example.estoquespring.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class A {
    // Ponto de injeção da dependencia
    @Autowired
    private B b;
    private int contador = 0;

    public int metodoA(){

        b.metodoB();
        return ++contador;
    }
}
