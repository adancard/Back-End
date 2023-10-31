package br.com.par.impar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImparController {
	
	@GetMapping("/par")
	public String par(@RequestParam int numero) {
		
		if(numero%2==0) {
			
			return "O numero "+numero+" E par";
			
		}else {
			
			return "O numero "+numero+" E impar";
			
		}
		
	}

}
