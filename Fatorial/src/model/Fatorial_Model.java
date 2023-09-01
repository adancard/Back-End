package model;

public class Fatorial_Model {

	//definindo variaves para fazer a conta
	private int numero;
	private double fat = 1;

	//construtor desse pacote
	public Fatorial_Model(int numero) {

		this.numero = numero;

	}

	
	//get and sets
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

}
