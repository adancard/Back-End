package model;

public class Aluno_Telefone {

	private int id_telefone;
	private Aluno aluno;
	private String telefone;

	public Aluno_Telefone(int id_telefone, Aluno aluno, String telefone) {

		this.id_telefone = id_telefone;
		this.aluno = aluno;
		this.telefone = telefone;

	}

	public int getId_telefone() {
		return id_telefone;
	}

	public void setId_telefone(int id_telefone) {
		this.id_telefone = id_telefone;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno id_aluno) {
		this.aluno = id_aluno;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
