  
package com.loja.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loja.games.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long>{
	List<ProdutoModel> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
	List<ProdutoModel> findAllByDescricaoContainingIgnoreCase(String descricao);
}
