package com.generation.farmacia.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="tb_produto")
public class ProdutoModel {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 4, max = 100, message="O campo deve ter no minimo 4 caracteres , e no maximo 100 caracteres")
	private String nome;
	
	@NotNull
	@Size(min = 4, max = 100, message="O campo deve ter no minimo 4 caracteres , e no maximo 100 caracteres")
	private String marca;
	
	@NotNull
	@Size(min = 3, max = 10, message="O campo deve ter no minimo 4 caracteres , e no maximo 100 caracteres")
	private String generico;
	
	@NotNull
	private float preco;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataVencimento = new java.sql.Date(System.currentTimeMillis());

	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private CategoriaModel categoria;
	

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getGenerico() {
		return generico;
	}

	public void setGenerico(String generico) {
		this.generico = generico;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public CategoriaModel getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaModel categoria) {
		this.categoria = categoria;
	}
	
	
	
	
	
	
}
