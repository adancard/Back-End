package com.senai.mdsgrupo04.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arquivo implements Serializable {

    private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String caminhoNoServidor;
    
	public Arquivo() {
		super();
	}

	public Arquivo(Long id, String caminhoNoServidor) {
		super();
		this.id = id;
		this.caminhoNoServidor = caminhoNoServidor;
	}

	public String getCaminhoNoServidor() {
		return caminhoNoServidor;
	}

	public void setCaminhoNoServidor(String caminhoNoServidor) {
		this.caminhoNoServidor = caminhoNoServidor;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caminhoNoServidor, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arquivo other = (Arquivo) obj;
		return Objects.equals(caminhoNoServidor, other.caminhoNoServidor) && Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Arquivo [id=" + id + ", caminhoNoServidor=" + caminhoNoServidor + "]";
	}
   
    
}
