package com.generation.lojadegames.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
	@GeneratedValue
	private Long id;
	
	@Column(length = 100)
    @NotBlank(message = "O nome da produto é obrigatório!")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;
	
	@Column(length = 1000)
    @NotBlank(message = "O atributo descrição é obrigatório!")
    @Size(min = 10, max = 1000, message = "A descrição deve ter entre 10 e 1000 caracteres")
    private String descricao;
	
    @NotNull(message = "O preço é obrigatório!")
    private BigDecimal preco;
    
    @NotBlank(message = "O atributo plataforma é obrigatório!")
    private String plataforma; // Exemplo: "PC", "PlayStation", "Xbox", "Switch"
    
    @NotBlank(message = "O link da foto é obrigatório!")
    @Size(max = 500, message = "O link da foto não pode ter mais de 500 caracteres.")
    private String foto;
   
	
    // Relacionamento N:1 com a classe Postagem
    
    @ManyToOne
    @JsonIgnoreProperties("produto")
    private Categoria categoria;
    
    // Getters e Setters

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
    

    
    

}
