package com.spring.banco.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.spring.banco.model.Carro;

public interface CarroRepository extends CrudRepository<Carro,Integer> {

	@Query("select c from Carro c where c.nome like %:nome%")
	Iterable<Carro> findByName(String nome);
	
}
