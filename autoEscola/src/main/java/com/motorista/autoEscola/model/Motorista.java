package com.motorista.autoEscola.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Motorista implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Integer id;
	
	@Column(name="nome")
	public String nome;
	
	@Column(name="tipo_carteira")
	public String tipo_Carteira;
	
	@Temporal(TemporalType.DATE)
	@Column(name="data_habilitacao")
	public Date data_habilitacao;

	public Motorista() {
	}

	public Motorista(String nome, String tipo_Carteira, Date data_habilitacao) {
		this.nome = nome;
		this.tipo_Carteira = tipo_Carteira;
		this.data_habilitacao = data_habilitacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo_Carteira() {
		return tipo_Carteira;
	}

	public void setTipo_Carteira(String tipo_Carteira) {
		this.tipo_Carteira = tipo_Carteira;
	}

	public Date getData_habilitacao() {
		return data_habilitacao;
	}

	public void setData_habilitacao(Date data_habilitacao) {
		this.data_habilitacao = data_habilitacao;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data_habilitacao, id, nome, tipo_Carteira);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motorista other = (Motorista) obj;
		return Objects.equals(data_habilitacao, other.data_habilitacao) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome) && Objects.equals(tipo_Carteira, other.tipo_Carteira);
	}

	@Override
	public String toString() {
		return "Motorista [id=" + id + ", nome=" + nome + ", tipo_Carteira=" + tipo_Carteira + ", data_habilitacao="
				+ data_habilitacao + "]";
	}

	
	
}
