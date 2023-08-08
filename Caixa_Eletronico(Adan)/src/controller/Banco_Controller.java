package controller;

//Importantdo as classes e o Scanner

import java.util.Scanner;
import model.Banco;
import view.Banco_View;

public class Banco_Controller {

	/*
	 *
	 * Criando variaveis de classes
	 * 
	 */

	private Banco banco;
	private Banco_View bancoView;

	/*
	 * 
	 * Contrutor
	 * 
	 */

	public Banco_Controller() {

		bancoView = new Banco_View();
		banco = new Banco(0, 0, 0);

	}

	/*
	 * 
	 * Metodo para fazer o deposito
	 * 
	 */

	public void depositar() {

		banco.setSaldo(banco.getSaldo() + banco.getDeposito());
		bancoView.mostrar(banco);

	}

	/*
	 * 
	 * Metodo para fazer a retirada, mas se o saldo estiver negativo ele nao ira
	 * efetuar o saque
	 * 
	 */

	public void retirar() {

		if (banco.getSaldo() > banco.getRetirar()) {

			banco.setSaldo(banco.getSaldo() - banco.getRetirar());
			bancoView.mostrar(banco);

		} else {

			bancoView.ErroR(banco);

		}

	}

	/*
	 * 
	 * Metodo para mostar o saldo
	 * 
	 */

	public void mostrarSaldo() {

		bancoView.mostrar(banco);

	}

	/*
	 * 
	 * Metodo para as escolhas do menu
	 * 
	 */

	public void mostrarMenu() {

		Scanner entrada = new Scanner(System.in);
		int opcao = 0, retirar, depositar;

		while (opcao != 4) {

			bancoView.menu();
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				mostrarSaldo();
				break;

			case 2:

				bancoView.valorS();
				retirar = entrada.nextInt();
				banco.setRetirar(retirar);
				retirar();
				break;

			case 3:

				bancoView.valorR();
				depositar = entrada.nextInt();
				banco.setDeposito(depositar);
				depositar();
				break;

			case 4:

				System.out.println("Saindo...");
				break;
				
			default:
				
				System.out.println("Escolha invalida");
				break;

			}

		}

		entrada.close();

	}

}
