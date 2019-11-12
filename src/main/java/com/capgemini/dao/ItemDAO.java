package com.capgemini.dao;

import java.util.ArrayList;

import model.Bebida;
import model.Comida;
import model.Item;
import model.Pedido;
import model.Tamanho;
import model.Tipo;

public class ItemDAO {

	ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	ArrayList<Item> itens = new ArrayList<Item>();
	Pedido pedido = new Pedido();

	public ItemDAO() {
		
			}

	public ArrayList<Pedido> criarPedido() {
		// TODO Auto-generated method stub
		Comida batata1 = new Comida();
		Comida batata2 = new Comida();
		Comida batata3 = new Comida();
		Bebida coca600 = new Bebida();
		Bebida coca350 = new Bebida();
		Bebida coca250 = new Bebida();
		Bebida umlitro = new Bebida();
		// setando atributos

		batata1.setId(00001);
		batata1.setNome("Batata Recheada");
		batata1.setPreco(15.00);
		batata1.setDescricao("Batata recheada com catupiry");
		batata1.setTipo(Tipo.BATATA);
		batata1.setObservacao("sem batata");

		batata2.setId(00002);
		batata2.setNome("Batata Recheada de requeijão");
		batata2.setPreco(20.00);
		batata2.setDescricao("Batata recheada com requeijão");
		batata2.setTipo(Tipo.BATATA);
		batata2.setObservacao("molho de creme");

		batata3.setId(00003);
		batata3.setNome("Batata Frita");
		batata3.setPreco(10.00);
		batata3.setDescricao("Batata recheada com requeijão");
		batata3.setTipo(Tipo.BATATA);
		batata3.setObservacao("molho de creme");
		batata3.setTamanho(Tamanho.GRANDE);

		coca600.setId(1001);
		coca600.setNome("Coca-cola 600ml");
		coca600.setPreco(6.00);
		coca600.setDescricao("Coca-cola 600ml");
		coca600.setObservacao("Coca-cola 600ml");
		coca600.setTipo(Tipo.REFRI);
		coca600.setTamanho(Tamanho.SEISCENTOS);

		coca350.setId(1002);
		coca350.setNome("Coca-cola 350ml");
		coca350.setPreco(6.00);
		coca350.setDescricao("Coca-cola 350ml");
		coca350.setObservacao("Coca-cola 350ml");
		coca350.setTipo(Tipo.REFRI);
		coca350.setTamanho(Tamanho.LATA350ML);

		coca250.setId(1003);
		coca250.setNome("Coca-cola 250ml");
		coca250.setPreco(6.00);
		coca250.setDescricao("Coca-cola 250ml");
		coca250.setObservacao("Coca-cola 250ml");
		coca250.setTipo(Tipo.REFRI);
		coca250.setTamanho(Tamanho.LATINHA250ML);

		
		umlitro.setId(1004);
		umlitro.setNome("Coca-cola 1L");
		umlitro.setPreco(6.00);
		umlitro.setDescricao("Coca-cola 1L");
		umlitro.setObservacao("Coca-cola 1L");
		umlitro.setTipo(Tipo.REFRI);
		umlitro.setTamanho(Tamanho.UMLITRO);

		itens.add(batata1);
		itens.add(batata2);
		itens.add(batata3);
		itens.add(coca600);
		itens.add(coca350);
		itens.add(coca250);
		itens.add(umlitro);

		pedido.setItem(itens);
		pedidos.add(pedido);

		return pedidos;

	}
	
	public void inserirItem(Item novo) {
	int x=itens.size()+1;
		novo.setId(x);
		itens.add(novo);
	}
	
	public boolean atualizarItem(Item novo, int id) {
		for (Item item : itens) {
			if (item.getId() == id) {
				item.setNome(novo.getNome());
				item.setDescricao(novo.getNome());
				item.setObservacao(novo.getObservacao());
				item.setPreco(novo.getPreco());
				item.setTipo(novo.getTipo());
				item.setTamanho(novo.getTamanho());
				return true;
			}
		}
		return false;
	}


	public boolean excluirItem(int id) {
		
		for (Item itens : itens) {
			if (itens.getId() == id) {
				pedido.getItem().remove(itens);
				return true;
			}

		}
		return false;
	}
	
	public ArrayList<Item> retornarTipo(int tipo){
		ArrayList<Item> tipos = new ArrayList<Item>();
		
		for (Item item : itens) {
		if (tipo == item.getTipo().getValor()) {
			tipos.add(item);
		}
		}
		return tipos;
	}
	
	public ArrayList<Item> retornarItem() {
		return itens;
	}
	public ArrayList<Pedido> retornarPedido() {
		return pedidos;
	}

	public Item buscarItemUnitario(int id) {
	
		for (Item item: itens) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}
	
}
