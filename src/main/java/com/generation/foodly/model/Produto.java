package com.generation.foodly.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Nome do Produto é obrigatório!")
	@Size(max = 100, message = "O atributo Nome do Produto tem que ser menor que 100 caracteres!")
	private String nomeProduto;
	
	@NotBlank(message = "O atributo Descrição do Produto é obrigatório!")
	@Size(max = 100, message = "O atributo Descrição do Produto tem que ser menor que 100 caracteres!")
	private String descricaoProduto;
	
	@NotNull(message = "O atributo Preço do Produto é obrigatório!")
	private Float precoProduto;
	
	@NotNull(message = "O atributo Tamanho da Porção é obrigatório!")
	private Float tamanhoPorcao;
	
	@ManyToOne
	@JsonBackReference
	private Categoria categoria; 
	
	@ManyToOne
	@JsonBackReference
	private Usuario usuario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getDescricaoProduto() {
		return descricaoProduto;
	}

	public void setDescricaoProduto(String descricaoProduto) {
		this.descricaoProduto = descricaoProduto;
	}

	public Float getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(Float precoProduto) {
		this.precoProduto = precoProduto;
	}

	public Float getTamanhoPorcao() {
		return tamanhoPorcao;
	}

	public void setTamanhoPorcao(Float tamanhoPorcao) {
		this.tamanhoPorcao = tamanhoPorcao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	

}
