package com.example.estoquespring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.estoquespring.model.Categoria;
import com.example.estoquespring.repository.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository repository;

    public void salvar(Categoria c){
        repository.save(c);
    }

    public void excluir(Categoria c){
        repository.delete(c);
    }

    public void excluirPorId(Long id){
        repository.deleteById(id);
    }

    public Categoria buscarPorId(Long id){
        return repository.findById(id).get();
    }

    public List<Categoria> buscarTodos(){
        return repository.findAll();
    }

}