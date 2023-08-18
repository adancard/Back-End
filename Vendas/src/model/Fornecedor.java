package model;

public class Fornecedor {
	
	private int idFornecedor;
	private String nome;
	private int CNPJ;
	private String email;
	
	
	public Fornecedor(int idFornecedor, String nome, int CNPJ, String email) {
		
		this.idFornecedor=idFornecedor;
		this.nome=nome;
		this.CNPJ=CNPJ;
		this.email=email;
		
	}

	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
