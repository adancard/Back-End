package view;

import java.util.List;

import model.Produto;

public class Produto_View {
	
	public void listaP (List<Produto> produto) {
		
		System.out.println("=====Lista de Produtos=====");
		
		for(Produto produtos: produto) {
			
			System.out.println("Produto id: "+produtos.getIdProduto()+" Nome do Produto: "+produtos.getNome()+ " Preco produto: "+produtos.getPreco()+" Quantidade: "+produtos.getQuantidade());
			
		}
		
		System.out.println("--------------------------------");
		
		
	}

}
