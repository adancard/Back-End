package model;

import java.util.Date;

public class Professor_Model {

	private String codigo;
	private String nome;
	private String codigo_diciplina;
	private String especialidade;
	private String data_admissao;

	public Professor_Model(String codigo, String nome, String codigo_diciplina, String especialidade,
			String data_admissao) {

		this.codigo = codigo;
		this.nome = nome;
		this.codigo_diciplina = codigo_diciplina;
		this.especialidade = especialidade;
		this.data_admissao = data_admissao;

	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo_diciplina() {
		return codigo_diciplina;
	}

	public void setCodigo_diciplina(String codigo_diciplina) {
		this.codigo_diciplina = codigo_diciplina;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getData_admissao() {
		return data_admissao;
	}

	public void setData_admissao(String data_admissao) {
		this.data_admissao = data_admissao;
	}

}
