package model;

public class Cliente {
	
	private int idCliente;
	private String nome;
	private String email;
	private int CPF;
	
	public Cliente(int idCliente, String nome,String email,int CPF) {
		
		this.idCliente=idCliente;
		this.nome=nome;
		this.email=email;
		this.CPF=CPF;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

}
