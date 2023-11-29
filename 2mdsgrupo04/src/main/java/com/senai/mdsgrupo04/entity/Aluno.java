package com.senai.mdsgrupo04.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno implements Serializable {
	
private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Aluno;
    private String nome;
    private Integer idade;
    private String data_Nascimento;
    private String numero;
    private String rua;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    
	public Aluno() {
		super();
	}

	public Aluno(Long id_Aluno, String nome, Integer idade, String data_Nascimento, String rua, String complemento,
			String bairro, String cidade,String numero, String estado, String cep) {
		super();
		this.id_Aluno = id_Aluno;
		this.nome = nome;
		this.idade = idade;
		this.data_Nascimento = data_Nascimento;
		this.rua = rua;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getData_Nascimento() {
		return data_Nascimento;
	}

	public void setData_Nascimento(String data_Nascimento) {
		this.data_Nascimento = data_Nascimento;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setId_Aluno(Long id_aluno) {
		
		this.id_Aluno = id_aluno;
		
	}

	public Long getId_Aluno() {
		return id_Aluno;
	}
	
	

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(bairro, cep, cidade, complemento, data_Nascimento, estado, id_Aluno, idade, nome, numero,
				rua);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(bairro, other.bairro) && Objects.equals(cep, other.cep)
				&& Objects.equals(cidade, other.cidade) && Objects.equals(complemento, other.complemento)
				&& Objects.equals(data_Nascimento, other.data_Nascimento) && Objects.equals(estado, other.estado)
				&& Objects.equals(id_Aluno, other.id_Aluno) && Objects.equals(idade, other.idade)
				&& Objects.equals(nome, other.nome) && Objects.equals(numero, other.numero)
				&& Objects.equals(rua, other.rua);
	}

	@Override
	public String toString() {
		return "Aluno [id_Aluno=" + id_Aluno + ", nome=" + nome + ", idade=" + idade + ", data_Nascimento="
				+ data_Nascimento + ", numero=" + numero + ", rua=" + rua + ", complemento=" + complemento + ", bairro="
				+ bairro + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + "]";
	}
}
