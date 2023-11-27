package com.java.revisao.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.revisao.entity.Cadastro;
import com.java.revisao.repository.CadastroRepository;



@RestController
@RequestMapping("/cadastro")
public class CadastroResource {

	@Autowired
	private CadastroRepository CadastroRepository;
	
	@GetMapping
	public Iterable<Cadastro> findAll(){
		return CadastroRepository.findAll();
	}
	
	@GetMapping("/nome/{nome}")
	public Iterable<Cadastro> findByNome(@PathVariable String nome){
		return CadastroRepository.findByNome(nome);
	}
	
	@GetMapping("/{codigo}")
	public Cadastro findById(@PathVariable Long codigo) {
		return CadastroRepository.findById(codigo).orElse(null);
	}
	
	@PostMapping
	public Cadastro createCadastro(@RequestBody Cadastro cadastro) {
		return CadastroRepository.save(cadastro);
	}
	
	@PutMapping("/{codigo}")
	public Cadastro updateCadastro(@PathVariable Long codigo, @RequestBody Cadastro cadastro) {
		cadastro.setCodigo(codigo);
		return CadastroRepository.save(cadastro);
	}
	
	@DeleteMapping("/{id}")
	public void deletePais(@PathVariable Long codigo) {
		CadastroRepository.deleteById(codigo);
	}
}
