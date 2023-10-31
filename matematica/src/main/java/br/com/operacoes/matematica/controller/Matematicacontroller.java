package br.com.operacoes.matematica.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Matematicacontroller {
	
	@GetMapping("/adicao")
	public String adicao(@RequestParam int num1, @RequestParam int num2) {
		
		return "A soma dos numero "+num1+"+"+num2+" = "+(num1+num2);
		
	}
	
	@GetMapping("/subtracao")
	public String subtracao(@RequestParam int num1, @RequestParam int num2) {
		
		return "A subtracao dos numero "+num1+"-"+num2+" = "+(num1-num2);
		
	}
	
	@GetMapping("/multiplicacao")
	public String multiplicacao(@RequestParam int num1, @RequestParam int num2) {
		
		return "A multiplicacao dos numero "+num1+"*"+num2+" = "+(num1*num2);
		
	}
	
	@GetMapping("/divisao")
	public String divisao(@RequestParam int num1, @RequestParam int num2) {
		
		if(num1 == 0 || num2 == 0) {
			
			return "Divisao por zero";
			
		}else {
				
				return "A divisao dos numero "+num1+"%"+num2+" = "+(num1/num2);
			}
			
		}
}
