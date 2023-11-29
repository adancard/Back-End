package com.senai.mdsgrupo04.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.mdsgrupo04.entity.Aluno;
import com.senai.mdsgrupo04.repository.AlunoRepository;

@RestController
@RequestMapping("/senai")
public class AlunoResource {

		@Autowired
		private AlunoRepository alunoRepository;
		
		@GetMapping("/api/consulta_todos")
		public Iterable<Aluno> findAll(){
			return alunoRepository.findAll();
		}
		
		@GetMapping("/api/consulta/{id_Aluno}")
		public Aluno findById(@PathVariable Long id_Aluno) {
			return alunoRepository.findById(id_Aluno).orElse(null);
		}
		
		@PostMapping("/api/criar")
		public Aluno createCadastro(@RequestBody Aluno aluno) {
			return alunoRepository.save(aluno);
		}
		
		@PutMapping("/api/atualiza/{id}")
		public Aluno updateCadastro(@PathVariable Long id_aluno, @RequestBody Aluno aluno) {
			aluno.setId_Aluno(id_aluno);
			return alunoRepository.save(aluno);
		}
		
		@DeleteMapping("/api/delete/{id}")
		public void deletePais(@PathVariable Long id_aluno) {
			alunoRepository.deleteById(id_aluno);
		}
	}


