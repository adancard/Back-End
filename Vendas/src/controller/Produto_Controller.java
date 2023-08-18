package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import view.Produto_View;

public class Produto_Controller {

	private List<Produto> listaProduto;
	private Produto_View produtoV;

	public Produto_Controller() {

		listaProduto = new ArrayList<Produto>();
		produtoV = new Produto_View();

	}

	public void Adicionar(int idProduto, String nome, double preco, int quantidade) {

		Produto produto = new Produto(idProduto, nome, preco, quantidade);

		listaProduto.add(produto);

	}

	public void mostrarProduto() {

		produtoV.listaP(listaProduto);

	}
	
}
