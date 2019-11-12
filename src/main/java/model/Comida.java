package model;

import java.util.ArrayList;
import java.util.Date;

public class Comida extends Item {
	private ArrayList<Item> ingredientes;
	private ArrayList<Item> adicionais;
	
	public Comida() {
		super();
	}

	public Comida(int id, String nome, double preco, String descricao, String observacao, Tipo tipo,Tamanho tamanho ,ArrayList<Item> ingredientes,ArrayList<Item> adicionais ) {
		super(id, nome, preco, descricao, observacao, tipo, tamanho);
		// TODO Auto-generated constructor stub
		this.ingredientes = ingredientes;
		this.adicionais = adicionais;
	}

	public ArrayList<Item> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Item> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public ArrayList<Item> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(ArrayList<Item> adicionais) {
		this.adicionais = adicionais;
	}
	
}
