package model;

import java.util.Date;

public class Bebida extends Item {
	private String sabor;

	private boolean gelo;
	public Bebida() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bebida(int id, String nome, double preco, String descricao, String observasao, Tipo tipo, String sabor, Tamanho tamanho, boolean gelo) {
		super(id, nome, preco, descricao, observasao, tipo, tamanho);
		// TODO Auto-generated constructor stub
		this.sabor = sabor;
	
		this.gelo = gelo;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	
	public boolean isGelo() {
		return gelo;
	}
	public void setGelo(boolean gelo) {
		this.gelo = gelo;
	}
	
	
	
	
}
