package com.capgemini.dao;

import java.util.ArrayList;

import model.Bebida;
import model.Comida;
import model.Item;
import model.Pedido;
import model.Tamanho;
import model.Tipo;

public class ProdutoDAO {
	
	
	ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
	ArrayList<Item> itens = new ArrayList<Item>();
	Pedido pedido = new Pedido();
	
	public ProdutoDAO() {
		criarComida();
	}
	public ArrayList<Pedido> criarComida() {
		// TODO Auto-generated method stub
		Comida batata1 = new Comida();
		Comida batata2 = new Comida();
		Comida batata3 = new Comida();
		Bebida coca600 = new Bebida();
		//setando atributos
		
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
		
		batata2.setId(00003);
		batata2.setNome("Batata Frita");
		batata2.setPreco(10.00);
		batata2.setDescricao("Batata recheada com requeijão");
		batata2.setTipo(Tipo.BATATA);
		batata2.setObservacao("molho de creme");
		batata2.setTamanho(Tamanho.GRANDE);
		

		coca600.setId(1001);
		coca600.setNome("Coca-cola 600ml");
		coca600.setPreco(6.00);
		coca600.setDescricao("Coca-cola 600ml");
		coca600.setObservacao("Coca-cola 600ml");
		coca600.setTipo(Tipo.REFRI);
		coca600.setTamanho(Tamanho.SEISCENTOS);
	
		itens.add(batata1);
		itens.add(batata2);
		itens.add(batata3);
		itens.add(coca600);
		
		pedido.setItem(itens);
		pedidos.add(pedido);

		
		return pedidos;
		
	}
	
 public ArrayList<Pedido> retornarPedido(){
	 return pedidos;
 }
 public Item buscarUmaBatata(int id) {
		for(Item itens : itens) {
			if(itens.getId()== id) {
				return itens;
			}
		
		}
		return null;
	}
}


