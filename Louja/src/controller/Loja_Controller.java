package controller;

import java.util.Scanner;

import dao.Loja_Dao;
import view.Loja_View;

public class Loja_Controller {

	private Loja_Dao lojaDao;
	private Loja_View lojaView;

	public Loja_Controller() {

		lojaDao = new Loja_Dao();
		lojaView = new Loja_View();

	}

	public void addProduto(String nome, double preco) {

		lojaDao.adicionarProduto(nome, preco);

	}

	public void ListarProdutos() {

		lojaView.exibir(lojaDao.obtemProdutos());

	}

	public void menu() {

		int opcao = -1;
		double preco;
		String nome;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {

			System.out.println("====== Menu ======");
			System.out.println("1. Adicionar Produto");
			System.out.println("2. Listar Produto");
			System.out.println("0. Sair");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Nome do Produto: ");
				nome = entrada.next();
				System.out.println("Preco do Produto");
				preco = entrada.nextDouble();
				addProduto(nome, preco);
				break;

			case 2:

				ListarProdutos();
				break;

			}

		}

	}

}
