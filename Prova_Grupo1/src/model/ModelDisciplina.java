package model;

public class ModelDisciplina {

	
	private String siglaDisciplina;
	private String nome;
	private String ementa;
	
	
	public ModelDisciplina(String siglaDisciplina, String nome, String ementa) {
		
		this.siglaDisciplina = siglaDisciplina;
		this.nome = nome;
		this.ementa = ementa;
	}
	
	
	
	public String getSiglaDisciplina() {
		return siglaDisciplina;
	}
	public void setSiglaDisciplina(String siglaDisciplina) {
		this.siglaDisciplina = siglaDisciplina;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	
	
	
}
