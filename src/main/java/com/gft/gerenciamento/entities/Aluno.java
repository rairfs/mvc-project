package com.gft.gerenciamento.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private Integer idade;
	
	private String nomeMae;
	
	private String nomePai;
	
	@Embedded
	private Endereco endereco;
	
	private Integer serie;
	
	@ManyToOne
	private Escola escola;
	
	@ManyToMany
	@JoinTable(name = "aluno_curso", 
	joinColumns = @JoinColumn(name = "aluno_id"), 
	inverseJoinColumns = @JoinColumn(name = "curso_id"))
	private List<Curso> cursos;
	
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
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Integer getSerie() {
		return serie;
	}
	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	public Escola getEscola() {
		return escola;
	}
	public void setEscola(Escola escola) {
		this.escola = escola;
	}
	
	
}
