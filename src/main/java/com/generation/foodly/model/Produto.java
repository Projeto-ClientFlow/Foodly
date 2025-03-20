package com.generation.foodly.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity 
@Table(name = "tb_produtos")
public class Produto {
	
	@ManyToOne
	@JsonIgnoreProperties("produto") 
	private Categoria categoria; 
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;

}
