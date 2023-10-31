package br.com.senai.senai.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Senaicontroller {
	
	@GetMapping("/nome")
	public String casa(@RequestParam String nome, @RequestParam int idade) {
		
		return "Ola, "+nome+" Voce tem, "+idade+" anos"; 
		
	}
	
	@GetMapping("/home")
	public String home() {
		
		return "Ola, seja bem vindo ao sistema. Voce esta na home";
		
	}
	
	@GetMapping("/home/aluno")
	public String aluno() {
		
		return"Ola, bem vindo aluno(a)";
		
	}
	
	@GetMapping("/home/aluno/professor")
	public String professor() {
		
		return "Ola, bem vindo professor(a)";
		
	}
	
	@GetMapping("/home/aluno/professor/senai")
	public String senai() {
		
		return "Ola, bem vindo ao Senai 2";
		
	}

}
