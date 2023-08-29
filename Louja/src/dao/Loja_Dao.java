package dao;

import java.util.ArrayList;
import java.util.List;

import model.Louja;

public class Loja_Dao {

	private List<Louja> listaLoja;

	public Loja_Dao() {

		listaLoja = new ArrayList<>();

	}

	public void adicionarProduto(String nome, double preco) {

		Louja lojaMain = new Louja(nome, preco);

		listaLoja.add(lojaMain);

	}

	public List<Louja> obtemProdutos() {

		return listaLoja;

	}

}
