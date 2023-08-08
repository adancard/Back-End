package model;

public class Banco {

	/*
	 * 
	 * Declarando as variaveis
	 * 
	 */
	
	private double saldo;
	private double deposito;
	private double retirar;

	
	/*
	 * 
	 * Contrutor
	 * 
	 */
	
	public Banco(double saldo, double deposito, double retirar) {

		this.saldo = saldo;
		this.deposito = deposito;
		this.retirar = retirar;

	}

	
	/*
	 * 
	 * get and sets
	 * 
	 */
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getRetirar() {
		return retirar;
	}

	public void setRetirar(double retirar) {
		this.retirar = retirar;
	}

}
