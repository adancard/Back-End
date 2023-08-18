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

	public void acharProduto(int idProduto, int quantidade) {


		if (listaProduto.isEmpty()) {

			System.out.println("Lista vazia");

		} else {

			for (Produto produtos : listaProduto) {

				if (idProduto == produtos.getIdProduto()) {

					System.out.println("Produto achado");
					
					if(quantidade < produtos.getQuantidade()) {
						
						System.out.println("Nao eh possivel fazer o pedido");
						
					}else {
						
						produtos.setQuantidade(quantidade - produtos.getQuantidade());
						
					}

				} else {

					System.out.println("ID do produto Incorreto");

				}

			}

		}

	}
	
}
