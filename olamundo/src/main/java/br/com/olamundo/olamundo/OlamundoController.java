package br.com.olamundo.olamundo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlamundoController {
	
	@GetMapping("/")
	public String casa() {
		
		return "Ola Mundo";
		
	}	
	
	@GetMapping("/ingles")
	public String home() {
		
		return "Hello Word";
		
	}

}
