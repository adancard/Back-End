package controller;

import java.util.Scanner;

import dao.Planeta_Dao;
import view.Planeta_View;

public class Planeta_Controller {
	
	private Planeta_View planetaView;
	private Planeta_Dao planetaDao;
	
	
	public Planeta_Controller() {
		
		planetaView = new Planeta_View();
		planetaDao = new Planeta_Dao();
		
	}
	
	public void addPlaneta(String nome) {
		
		planetaDao.adicionarPlaneta(nome);
		
	}
	
	public void listarPlanetas() {
		
		
	planetaView.mostrarPlaneta(planetaDao.obtemListaPlaneta());
		
	}
	
	
	public void menu() {

		int opcao = -1;
		String nome;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {

			System.out.println("====== Menu ======");
			System.out.println("1. Adicionar Planeta");
			System.out.println("2. Listar Planeta");
			System.out.println("0. Sair");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Nome do Planeta: ");
				nome = entrada.next();
				addPlaneta(nome);
				break;

			case 2:

				listarPlanetas();
				break;

			}

		}

	}
	
	

}
