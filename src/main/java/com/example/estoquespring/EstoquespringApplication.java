package com.example.estoquespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.Date;
import com.example.estoquespring.model.*;
import com.example.estoquespring.repository.*;
import com.example.estoquespring.service.*;

@SpringBootApplication
public class EstoquespringApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(EstoquespringApplication.class, args);
		
    	Categoria c = new Categoria();
		c.setNome("Camisas de Time");

		CategoriaRepository rep = ctx.getBean(CategoriaRepository.class);
		rep.save(c);

		Fornecedor f = new Fornecedor();
		f.setNome("Lamine Yamal");
		f.setCnpj("01739245501");
		f.setTelefone("77982222222");
		f.setEmail("yamal10@gmail.com");

		FornecedorService rep1 = ctx.getBean(FornecedorService.class);
		rep1.salvar(f);
		// rep1.excluir(f);
		// rep1.excluirPorId(f.getId());
		rep1.buscarPorId(f.getId());
		rep1.buscarTodos();

		Produto p = new Produto();
		p.setNome("Camisa do Barcelona - N. 10");
		p.setCategoria("Camisas de Time");
		p.setQtdeMinima(50);
		p.setQtdeEstoque(120);
		p.setUnidadeMedida("M");

		ProdutoService rep2 = ctx.getBean(ProdutoService.class);
		rep2.salvar(p);
		// rep2.excluir(f);
		// rep2.excluirPorId(p.getId());
		rep2.buscarPorId(p.getId());
		rep2.buscarTodos();

		Movimentacao m = new Movimentacao();

		m.setProduto(p.getNome());
		m.setQuantidade(p.getQtdeEstoque());
		m.setFornecedor(f.getNome());
		m.setTipoMovimentacao("Caminhões - Barcelona até Madrid");
		// m.setData(new Date());
		
		/* 
		A a = ctx.getBean(A.class);
		System.out.println(a.metodoA());
		A a1 = ctx.getBean(A.class);
		System.out.println(a1.metodoA());
		*/

	}

}
