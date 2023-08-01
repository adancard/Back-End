package View;

import Model.Produto;

public class Produto_view {

	// metodo para exibir produtos
	public void exibirProduto(Produto produto) {

		System.out.println("====Detalhes do Produto====");
		System.out.println("ID Produto: " + produto.getIdProduto());
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preco: " + produto.getPreco());
		System.out.println("---------------------------");
	}

}
