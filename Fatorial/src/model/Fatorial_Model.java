package model;

public class Fatorial_Model {

	private int numero;
	private double fat = 1;

	public Fatorial_Model(int numero) {

		this.numero = numero;

	}

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
