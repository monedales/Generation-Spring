package com.generation.boardgame.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.generation.boardgame.model.Produto;

@Repository //classe abstrata que herda a Interface JpaRepository
public interface ProdutoRepository extends JpaRepository<Produto, Long> //Produto é a classe que gera a tabela e Long é a primary key
{	
	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String Nome);
}
