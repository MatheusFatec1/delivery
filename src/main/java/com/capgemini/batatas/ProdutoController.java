package com.capgemini.batatas;

import java.util.ArrayList;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capgemini.dao.ProdutoDAO;

import model.Item;
import model.Pedido;


@Controller
public class ProdutoController {
	ProdutoDAO p1 = new ProdutoDAO();
	ArrayList<Pedido> comidas = p1.criarComida();
	
	@GetMapping("/batatas")
	@ResponseBody
	public ArrayList<Pedido> buscarTodasBatatas() {
		
		
		return comidas;
	}
	
	@GetMapping("/batatas/{id}")
	@ResponseBody
	public Item buscarUmaBatata(@PathVariable int id) {
		return p1.buscarUmaBatata(id);
	}
	
	
	
	
}
