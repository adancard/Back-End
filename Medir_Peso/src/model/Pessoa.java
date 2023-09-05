package model;

public class Pessoa {

	private String nome;
	private String sexo;
	private double altura;
	private double peso;
	private int idade;

	public Pessoa(String nome, String sexo, double altura, double peso, int idade) {

		this.nome = nome;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
