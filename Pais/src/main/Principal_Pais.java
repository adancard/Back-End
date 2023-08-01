package main;

import java.util.Scanner;

import controller.Paises_controller;

public class Principal_Pais {

	public static void main(String[] args) {

		Paises_controller paisC = new Paises_controller();
		Scanner entrada = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("=====Menu=====");
			System.out.println("1.adicionar pais");
			System.out.println("2.exibir pais");
			System.out.println("3.Limpar lista");
			System.out.println("4.Remover pais");
			System.out.println("0.sair");
			System.out.println("Escolha uma opcao: ");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Pais: ");
				entrada.nextLine();
				String nome = entrada.next();

				System.out.println("Digite a capital do pais: " + nome + ": ");
				entrada.nextLine();
				String capital = entrada.next();

				paisC.adicionar(nome, capital);
				break;

			case 2:

				paisC.exibir();
				break;

			case 3:

				paisC.limpar();
				break;

			case 4:

				System.out.println("Informe o index para apagar: ");
				int index = entrada.nextInt();
				paisC.remover(index);

			case 0:

				System.out.println("Saindo....");
				break;

			default:

				System.out.println("Opcao invalida");
				break;

			}

		}

		entrada.close();

	}

}
