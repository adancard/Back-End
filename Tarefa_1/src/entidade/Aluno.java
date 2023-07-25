package entidade;

public class Aluno {

	private String nome;
	private String sobrenome;
	private double matricula;

	public Aluno() {

	}

	public Aluno(String nome, String sobrenome, double matricula) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.matricula = matricula;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getMatricula() {
		return matricula;
	}

	public void setMatricula(double matricula) {
		this.matricula = matricula;
	}

}
