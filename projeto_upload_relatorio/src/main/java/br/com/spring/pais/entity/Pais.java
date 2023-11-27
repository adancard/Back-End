package br.com.spring.pais.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Pais implements Serializable {

    private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private Integer ordem;
    private String sigla2;
    private String sigla3;
}

