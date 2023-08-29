package view;

import java.util.List;

import model.Louja;

public class Loja_View {

	public void exibir(List<Louja> loja) {

		System.out.println("========== Produtos Registrado ==========");

		for (Louja lojaMain : loja) {

			System.out.println("Nome Produto: " + lojaMain.getNome() + " Preco do Produto: " + lojaMain.getPreco());

		}

		System.out.println("------------------------------------");

	}

}
