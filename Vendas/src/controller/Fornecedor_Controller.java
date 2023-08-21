package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Fornecedor;
import model.Produto;
import view.Fornecedor_View;
import view.Produto_View;

public class Fornecedor_Controller {

	private List<Fornecedor> forne;
	private Fornecedor_View forneV;
	private Produto_Controller produtoC;
	private Main_controller mainC;

	public Fornecedor_Controller() {

		forne = new ArrayList<Fornecedor>();
		forneV = new Fornecedor_View();
		produtoC = new Produto_Controller();
		mainC = new Main_controller();

	}

	public void addF(int idFornecedor, String nome, int CNPJ, String email) {

		Fornecedor fornes = new Fornecedor(idFornecedor, nome, CNPJ, email);

		forne.add(fornes);

	}

	public void mostrarFornecedor() {

		forneV.listaF(forne);

	}

	public void validarCPNJ(int CNPJ) {

		if (forne.isEmpty()) {

			System.out.println("Lista vazia");

		} else {

			for (Fornecedor fornesce : forne) {

				if (fornesce.getCNPJ() == CNPJ) {

					System.out.println("Bem vindo" + fornesce.getNome());
					addproduto();

				} else {

					System.out.println("CNPJ Incorreto");

				}

			}

		}

	}

	public void menuForne() {
		int opcao = 1, id, cnpj;
		String nome, email;
		Scanner entrada = new Scanner(System.in);

		do {

			System.out.println("1. cadastrar");
			System.out.println("2. entrar");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("id");
				id = entrada.nextInt();

				System.out.println("nome");
				nome = entrada.next();

				System.out.println("email");
				email = entrada.next();

				System.out.println("cnpj");
				cnpj = entrada.nextInt();

				addF(id, nome, cnpj, email);

				break;

			case 2:

				System.out.println("cnpj");
				cnpj = entrada.nextInt();
				validarCPNJ(cnpj);
				break;

			}

		} while (opcao != 0);
	}

	public void addproduto() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Id Produto: ");
		int id = entrada.nextInt();

		System.out.println("Nome produto");
		String nome = entrada.next();

		System.out.println("Preco: ");
		double preco = entrada.nextDouble();

		System.out.println("Quantidade:");
		int quantidade = entrada.nextInt();

		produtoC.Adicionar(id, nome, preco, quantidade);
		produtoC.mostrarProduto();

	}

}