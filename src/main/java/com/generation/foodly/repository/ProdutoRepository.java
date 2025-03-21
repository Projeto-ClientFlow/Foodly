package com.generation.foodly.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.foodly.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public Optional<Produto> findByNomeProduto(@Param("nomeProduto") String nomeProduto);
	
	public List<Produto> findAllByNomeProdutoContainingIgnoreCase(@Param("nomeProduto") String nomeProduto);

}
