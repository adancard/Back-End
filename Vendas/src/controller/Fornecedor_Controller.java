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
	private List<Produto> listaproduto;
	private Fornecedor_View forneV;
	private Produto_Controller produtoC;
	private Produto_View produtoV;

	public Fornecedor_Controller() {

		forne = new ArrayList<Fornecedor>();
		forneV = new Fornecedor_View();
		produtoC = new Produto_Controller();
		produtoV = new Produto_View();

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

		while (opcao != 0) {

			System.out.println("1. cadastrar");
			System.out.println("2. entrar");

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

				System.out.println("1.adicionar produto");
				System.out.println("2.listar produtos");
				opcao = entrada.nextInt();

				switch (opcao) {

				case 1:

					System.out.println("id Produto: ");
					id = entrada.nextInt();

					System.out.println("nome produto");
					nome = entrada.next();

					System.out.println("Preco produto");
					double preco = entrada.nextDouble();

					System.out.println("Quantidade produto");
					int quantidade = entrada.nextInt();

					produtoC.Adicionar(id, nome, preco, quantidade);
					break;

				case 2:

					produtoV.listaP(listaproduto);
					break;

				}

			}

		}

		entrada.close();

	}

}
