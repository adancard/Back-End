package controller;

import java.util.Scanner;

public class Main_controller {

	public void menu() {

		int opcao = 1;
		Scanner entrada = new Scanner(System.in);
		Cliente_Controller clienteC = new Cliente_Controller();
		Fornecedor_Controller forneC = new Fornecedor_Controller();

		do {

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
					break;

				}
				
				break;

			case 2:

				forneC.menuForne();
				break;

			}

		} while (opcao != 0);

	}
}
