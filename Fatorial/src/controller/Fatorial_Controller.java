package controller;

import java.util.Scanner;

import dao.Fatorial_Dao;
import view.Fatorial_View;

public class Fatorial_Controller {

	//Declarando as variaveis de nossos pacotes Fatorial dao e fatorial view
	private Fatorial_Dao fatorialDao;
	private Fatorial_View fatorialView;

	//construtor desse pacote
	public Fatorial_Controller() {

		fatorialDao = new Fatorial_Dao();
		fatorialView = new Fatorial_View();

	}

	
	//Metodo para adicionar o numero fatorado na lista Fatorial dao
	public void adicionarFatorial(int numero) {

		fatorialDao.addNumero(numero);

	}

	
	//Metodo para Mostrar a lista para o usuario
	public void mostrarLista() {

		fatorialView.exibir(fatorialDao.obtemLista());

	}

	//Metodo para mostrar o menu de escolhar para o usuario
	public void menu() {
		Scanner entrada = new Scanner(System.in);
		int opcao = -1, numero;

		while (opcao != 0) {

			System.out.println("========== Menu ==========");
			System.out.println("1. Fazer Fatorial");
			System.out.println("2. Listar os ultimos 5");
			System.out.println("0. Sair");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Informe o numero: ");
				numero = entrada.nextInt();
				adicionarFatorial(numero);
				break;

			case 2:

				mostrarLista();
				break;

			case 0:

				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opcao Invalida");
				break;

			}

		}
		
		entrada.close();

	}

}
