package Controller;

import Model.Produto;
import View.Produto_view;

public class Produto_controller {

	private Produto_view produtoview;

	// contrutor
	public Produto_controller() {

		produtoview = new Produto_view();

	}

	// metodo para cirar produto
	public Produto criarProduto(int idProduto, String nome, double preco) {

		Produto produto = new Produto(idProduto, nome, preco);

		return produto;

	}

	// metodo para exibir o detalhes do produto
	public void exibirDetalhesProduto(Produto produto) {

		produtoview.exibirProduto(produto);

	}

}
