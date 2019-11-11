package model;

import java.util.ArrayList;

public class Cliente {
	private String nome;
	private String cpf;
	private int ddd;
	private int numeroCelular;
	private ArrayList<Endereco> enderecos;
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nome, String cpf, int ddd, int numeroCelular, ArrayList<Endereco> enderecos) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ddd = ddd;
		this.numeroCelular = numeroCelular;
		this.enderecos = enderecos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public int getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(int numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
		
	
}
