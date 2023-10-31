package br.com.Strings.palavras.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalavrasController {
	
	@GetMapping("/inverter")
	public String inverter(@RequestParam String frase) {
		
		return new StringBuilder(frase).reverse().toString();
		
	}
	
	@GetMapping("/contar")
	public int contar(@RequestParam String frase) {
		
		return frase.toString().length();
		
	}
	
	@GetMapping("/converter/minusculas")
	public String minusculas(@RequestParam String frase) {
		
		return frase.toString().toLowerCase();
		
	}
	
	@GetMapping("/converter/maiusculas")
	public String maiusculas(@RequestParam String frase) {
		
		return frase.toString().toUpperCase();
		
	}
	
	

}
