package controller;

import java.util.Scanner;

public class Main_controller {

	public void menu() {

		int opcao = 1;
		Scanner entrada = new Scanner(System.in);
		Cliente_Controller clienteC = new Cliente_Controller();
		Pedido_Controller pedidoC = new Pedido_Controller();
		Fornecedor_Controller forneC = new Fornecedor_Controller();
		Produto_Controller produtoC = new Produto_Controller();

		while (opcao != 1) {

			System.out.println("1.Cliente");
			System.out.println("2.Fornecedor");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("1. cadastrar ");
				System.out.println("2. entrar");
				opcao = entrada.nextInt();

				switch (opcao) {

				case 1:

					System.out.println("id Cliente");
					int id = entrada.nextInt();

					System.out.println("Nome cliente");
					String nome = entrada.next();

					System.out.println("email do cliente");
					String email = entrada.next();

					System.out.println("cpf cliente");
					int cpf = entrada.nextInt();

					clienteC.addC(id, nome, email, cpf);
					break;

				case 2:

					System.out.println("cpf cliente");
					cpf = entrada.nextInt();
					clienteC.validadrCpf(cpf);

					pedidoC.menuProduto();
					break;

				}
				break;

			case 2:

				System.out.println("1.cadastrar");
				System.out.println("2.entrar");
				opcao = entrada.nextInt();

				switch (opcao) {

				case 1:

					System.out.println("id Cliente");
					int id = entrada.nextInt();

					System.out.println("Nome cliente");
					String nome = entrada.next();

					System.out.println("email do cliente");
					String email = entrada.next();

					System.out.println("cpf cliente");
					int cnpj = entrada.nextInt();

					forneC.addF(id, nome, cnpj, email);

					break;

				case 2:

					System.out.println("cpf cliente");
					cnpj = entrada.nextInt();

					forneC.validarCPNJ(cnpj);

					System.out.println("id do produto");
					id = entrada.nextInt();

					System.out.println("nome do produto");
					nome = entrada.next();

					System.out.println("preco");
					double preco = entrada.nextDouble();

					System.out.println("Quantidade");
					int quantidade = entrada.nextInt();

					produtoC.Adicionar(id, nome, preco, quantidade);
					break;

				}

			}

		}
		entrada.close();
	}
}
