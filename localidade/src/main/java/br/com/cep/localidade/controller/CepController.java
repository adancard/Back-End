package br.com.cep.localidade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class CepController {

	private String API = "https://viacep.com.br/ws//json/";

	@GetMapping("/cep/{cep}")
	public String cep(@PathVariable int cep) {

		API = "https://viacep.com.br/ws/" + Integer.toString(cep) + "/json/";

		return restTemplate().getForObject(API, String.class);

	}

	@GetMapping("/cep/logradouro/{cep}")
	public String logradouro(@PathVariable int cep) throws JsonMappingException, JsonProcessingException {

		API = "https://viacep.com.br/ws/" + Integer.toString(cep) + "/json/";

		String reposta = restTemplate().getForObject(API, String.class);

		try {

			ObjectMapper objectMapper = new ObjectMapper();

			JsonNode rootNode = objectMapper.readTree(reposta);
			if (rootNode.has("logradouro")) {

				return rootNode.get("logradouro").asText();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "N/A";

	}

	@GetMapping("/cep/uf/{cep}")
	public String uf(@PathVariable int cep) throws JsonMappingException, JsonProcessingException {

		API = "https://viacep.com.br/ws/" + Integer.toString(cep) + "/json/";

		String reposta = restTemplate().getForObject(API, String.class);

		try {

			ObjectMapper objectMapper = new ObjectMapper();

			JsonNode rootNode = objectMapper.readTree(reposta);
			if (rootNode.has("uf")) {

				return rootNode.get("uf").asText();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "N/A";

	}

	@GetMapping("/cep/localidade/{cep}")
	public String localidade(@PathVariable int cep) throws JsonMappingException, JsonProcessingException {

		API = "https://viacep.com.br/ws/" + Integer.toString(cep) + "/json/";

		String reposta = restTemplate().getForObject(API, String.class);

		try {

			ObjectMapper objectMapper = new ObjectMapper();

			JsonNode rootNode = objectMapper.readTree(reposta);
			if (rootNode.has("localidade")) {

				return rootNode.get("localidade").asText();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "N/A";

	}

	@GetMapping("/cep/ibge/{cep}")
	public String ibge(@PathVariable int cep) throws JsonMappingException, JsonProcessingException {

		API = "https://viacep.com.br/ws/" + Integer.toString(cep) + "/json/";

		String reposta = restTemplate().getForObject(API, String.class);

		try {

			ObjectMapper objectMapper = new ObjectMapper();

			JsonNode rootNode = objectMapper.readTree(reposta);
			if (rootNode.has("ibge")) {

				return rootNode.get("ibge").asText();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "N/A";

	}

	private RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
