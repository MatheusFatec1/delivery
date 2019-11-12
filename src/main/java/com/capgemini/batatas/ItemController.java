package com.capgemini.batatas;

import java.util.ArrayList;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.dao.ItemDAO;

import model.Item;
import model.Pedido;


@Controller
@RequestMapping("/itens")
public class ItemController {
	ItemDAO p1 = new ItemDAO();
	ArrayList<Pedido> pedidos = p1.criarPedido();
	ArrayList<Item> itens = p1.retornarItem();
	
	
	@GetMapping("")
	@ResponseBody
	public ArrayList<Item> buscarTodosItens() {
		return itens;
	}
	
	@PutMapping("/atualizar/{id}")
	@ResponseBody
	public boolean atualizarItem(@RequestBody Item novo, @PathVariable int id) {
		return p1.atualizarItem(novo,id);
	}
	
	
	
	@GetMapping("/tipo/{tipo}")
	@ResponseBody
	public ArrayList<Item> buscarPorTipo(@PathVariable int tipo) {
		ArrayList<Item> tipos = p1.retornarTipo(tipo);
		return tipos;
	}
	
	@PostMapping("/inserir")
	@ResponseBody
	public void inserirItem(@RequestBody Item novo) {
		p1.inserirItem(novo);
	}
	
	@DeleteMapping("/excluir/{id}")
	@ResponseBody
	public void excluirItem(@PathVariable int id) {
		p1.excluirItem(id);
	}
	
	
	
/*	
	@GetMapping("/batatas/{id}")
	@ResponseBody
	public Item buscarUmaBatata(@PathVariable int id) {
		return p1.buscarUmaBatata(id);
	}
	*/
	@GetMapping("/buscar/{id}")
	@ResponseBody
	public Item buscarItemUnitario(@PathVariable int id) {
		return p1.buscarItemUnitario(id);
	}
}
