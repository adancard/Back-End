package com.senai.mdsgrupo04.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.senai.mdsgrupo04.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
	@Query("SELECT p FROM Aluno p WHERE p.nome LIKE %:nome%")
	Iterable<Aluno> findByNome(String nome);
}

