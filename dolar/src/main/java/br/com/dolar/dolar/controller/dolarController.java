package br.com.dolar.dolar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class dolarController {
	
	@GetMapping("/cambio")
	public String conversao(@RequestParam String nome, @RequestParam int valor) {
		
		System.out.println(nome.toString());
		
		if(nome.equals("dolar")) {
			
			System.out.println("caiu dolar");
			
			return "Voce tem "+(valor*5)+" Dolares"+" ou "+valor+" reais";
			
		}else {
			
			System.out.println("caiu real");
			
			return "Voce tem "+(valor)+" Reais"+" ou "+(valor/5)+" dolares";
			
		}
		
	}

}
