package model;

import java.util.Date;

public class Item {
	private int id;
	private String nome;
	private double preco;
	private String descricao;
	private String observacao;
	private Tipo tipo;
	private Tamanho tamanho;
	 
	
	public Item() {
		super();
	}

	public Item(int id, String nome, double preco, String descricao, String observacao, Tipo tipo, Tamanho tamanho) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.observacao = observacao;
		this.tipo = tipo;
		this.tamanho = tamanho;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public String getObservacao() {
		return observacao;
	}


	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}


	public Tipo getTipo() {
		return tipo;
	}


	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Tamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(Tamanho tamanho) {
		this.tamanho = tamanho;
	}

}
