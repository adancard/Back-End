package com.java.revisao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.revisao.entity.Cadastro;

/*
 * JpaRepository<Pais, Long>
 * Estende CrudRepository e fornece funcionalidades adicionais específicas do JPA.
 * Adiciona métodos como flush para sincronizar o contexto de persistência, saveAndFlush para salvar e sincronizar imediatamente, e métodos para operações de paginação e ordenação.
 * Mais adequado quando você precisa de funcionalidades específicas do JPA e quer se beneficiar das convenções adicionais fornecidas pelo Spring Data JPA.
 */
@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long> {
	@Query("SELECT p FROM Cadastro p WHERE p.nome LIKE %:nome%")
	Iterable<Cadastro> findByNome(String nome);
}
