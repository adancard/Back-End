package br.com.API.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class APIController {
	
	private final String API = "https://economia.awesomeapi.com.br/json/last/USD-BRL";
	
	@GetMapping("/compra")
	public String getcompra() {
		
		return getFieldValue("bird");
		
	}
	
	@GetMapping("/venda")
	public String getvenda() {
		
		return getFieldValue("ask");
		
	}
	
	@GetMapping("/max")
	public String getmax() {
		
		return getFieldValue("high");
		
	}
	
	@GetMapping("/min")
	public String getmin() {
		
		return getFieldValue("low");
		
	}
	
	@GetMapping("/all")
	public String getall() {
		
		return restTemplate().getForObject(API, String.class);
		
	}
	
	private String getFieldValue(String field) {
		String response = restTemplate().getForObject(API, String.class);
		// Parse JSON response to extract the specified field
		if (response != null) {
			int startIndex = response.indexOf("\"" + field + "\":\"");
			if (startIndex != -1) {
				startIndex += field.length() + 4; // Adjust the start index
				int endIndex = response.indexOf("\"", startIndex);
				if (endIndex != -1) {
					return response.substring(startIndex, endIndex);
				}
			}
		}
		return "N/A";
	}

	private RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
