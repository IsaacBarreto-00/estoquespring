package com.example.estoquespring.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
@Scope("singleton")
public class B {
   
    public void metodoB(){
        System.out.println("Resultado de B");
    }
}
