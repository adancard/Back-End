package model;

public class Aluno {

	private int id_aluno;
	private String nome;
	private int idade;

	public Aluno(int id_aluno, String nome, int idade) {

		this.id_aluno = id_aluno;
		this.nome = nome;
		this.idade = idade;

	}

	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
