package model;

import java.util.ArrayList;
import java.util.Date;


public class Pedido{
	private int id;
	private String nome;
	private double preco;
	private String descricao;
	private Tipo tipo;
	private Date data;
	private double frete;
	private boolean delivery;
	private Status status;
	private ArrayList<Item> item;
	
	
	public Pedido() {
	
	}

	public Pedido(int id, String nome, double preco, String descricao, Tipo tipo, Date data, double frete,
			boolean delivery, Status status,ArrayList<Item> item) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
		this.tipo = tipo;
		this.data = data;
		this.frete = frete;
		this.delivery = delivery;
		this.status = status;
		this.item = item;
	}
	
	public double calcularPreco() {
		double precoT=0;
		 for(Item i: item) {
			preco += i.getPreco();
		}
		 return precoT;
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

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getFrete() {
		return frete;
	}

	public void setFrete(double frete) {
		this.frete = frete;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ArrayList<Item> getItem() {
		return item;
	}

	public void setItem(ArrayList<Item> item) {
		this.item = item;
	}
	
	
	
	

}
