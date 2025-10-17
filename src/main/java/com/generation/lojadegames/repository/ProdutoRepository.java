package com.generation.lojadegames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.generation.lojadegames.model.Produto;	

	public interface ProdutoRepository extends JpaRepository<Produto, Long> {
		 List<Produto> findAllByNomeContainingIgnoreCase(String nome);
		 
	    // Produtos com preço maior que "X", ordem crescente
	    List<Produto> findByPrecoGreaterThanOrderByPrecoAsc(Double preco);
	    
	    // Produtos com preço menor que "X", ordem decrescente
	    List<Produto> findByPrecoLessThanOrderByPrecoDesc(Double preco);

}
