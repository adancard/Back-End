package com.senai.mdsgrupo04.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.senai.mdsgrupo04.entity.Arquivo;

@Repository
public interface ArquivoRepository extends CrudRepository<Arquivo, Long> {
}



