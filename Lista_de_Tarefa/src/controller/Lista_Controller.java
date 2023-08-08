package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Lista;
import view.Lista_View;

public class Lista_Controller {

	private List<Lista> listaA;
	private Lista_View listaView;

	public Lista_Controller() {

		listaA = new ArrayList<>();
		listaView = new Lista_View();

	}

	public void adicionar(String nome, String status) {

		Lista lista = new Lista(nome, status);
		listaA.add(lista);

	}

	public void mostrarLista() {

		listaView.listar(listaA);

	}

	public void menu() {

		Scanner entrada = new Scanner(System.in);

		int opcao = 0;
		String nome, status;

		while (opcao != 3) {

			listaView.menu();
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				listaView.perguntaT();
				nome = entrada.next();

				entrada.nextLine();

				listaView.perguntaS();
				status = entrada.next();

				entrada.nextLine();

				adicionar(nome, status);
				break;

			case 2:

				mostrarLista();
				break;
				
			case 3:
				
				listaView.sair();
				break;

			default:

				System.out.println("Opcao invalida");
				break;

			}

		}
		
		entrada.close();

	}

}
