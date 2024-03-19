package com.senai.aluno.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.senai.aluno.entity.Aluno;


public interface AlunoRepository extends CrudRepository<Aluno, Long>{
	
	@Query("SELECT a FROM Aluno a WHERE a.nome LIKE :nome%")
	Iterable<Aluno> findByNome(String nome);
	
}
