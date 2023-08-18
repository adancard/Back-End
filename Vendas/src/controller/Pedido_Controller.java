package controller;

import model.Produto;

public class Pedido_Controller {
	
	private Produto_Controller produtoC;
	
	public Pedido_Controller() {
		
		produtoC = new Produto_Controller();
		
	}
	
	public void buscarP(int idProduto, String nome, double preco, int quantidade) {
		
		Produto produto = new Produto(idProduto,nome,preco,quantidade);		
	
		
		
	}


}
