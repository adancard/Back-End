package model;

public class Lista {

	private String nome;
	private String status;

	public Lista(String nome, String status) {

		this.nome = nome;
		this.status = status;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
