package com.spring.banco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.banco.model.Carro;
import com.spring.banco.repository.CarroRepository;

@RestController
@RequestMapping("/carros")
public class carroController {

	@Autowired
	private CarroRepository carroRepository;

	@GetMapping
	public Iterable<Carro> buscarCarro() {

		return carroRepository.findAll();

	}

	// metodo para busca pelo id
	@GetMapping("/{id}")
	public Carro buscarCarroId(@PathVariable Integer id) {
		return carroRepository.findById(id).orElse(null);
	}

	// metodo para buscar por nome
	@GetMapping("/nome/{nome}")
	public Iterable<Carro> buscarCarroNome(@PathVariable String nome) {
		return carroRepository.findByName(nome);
	}

	// metodo para adicionar o carro
	@PostMapping
	public Carro adicionarCarro(@RequestBody Carro carro) {

		return carroRepository.save(carro);

	}

	// metodo para atulaizar o carro por id
	@PutMapping("/{id}")
	public Carro atualizarCarro(@PathVariable Integer id, @RequestBody Carro carro) {

		return carroRepository.save(carro);

	}

	// metodo para deletar por id
	@DeleteMapping("/{id}")
	public void deletaCarro(@PathVariable Integer id) {

		carroRepository.deleteById(id);

	}

}
