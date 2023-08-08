package view;

import model.Banco;

public class Banco_View {

	/*
	 * 
	 * Metodo para Mostrar o saldo do banco
	 *
	 */

	public void mostrar(Banco banco) {

		System.out.println("Seu saldo eh: " + banco.getSaldo());
		System.out.println(" ");

	}

	/*
	 * 
	 * Metodo para Mostrar o menu
	 * 
	 */

	public void menu() {

		System.out.println("====Menu====");
		System.out.println("1.Consultar Saldo");
		System.out.println("2.Sacar Saldo");
		System.out.println("3.Depositar Saldo");
		System.out.println("4.Sair");
		System.out.println("Digite a opçao: ");

	}
	
	/*
	 * 
	 * metodo para mostrar o erro de retirada
	 * 
	 */
	
	public void ErroR(Banco banco) {
		
		System.out.println("Impossivel retirar do seu saldo");
		mostrar(banco);
	}
	
	
	/*
	 * 
	 * metodo que pergunta o valor do saque
	 * 
	 */
	
	public void valorS() {
		
		System.out.println("Valor de Saque: ");
		
	}
	
	/*
	 * 
	 * metodo que pergunta o valor da retirada
	 * 
	 */
	
	public void valorR() {
		
		System.out.println("Valor de Retirada: ");
		
	}

}
