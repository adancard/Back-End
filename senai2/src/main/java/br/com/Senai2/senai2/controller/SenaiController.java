package br.com.Senai2.senai2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SenaiController {

	@GetMapping("/senaisaocarlos")
	public String senai() {
		
		return "<img src=\"https://cronos-media.sesisenaisp.org.br//api/media/1-0/files?img=img_1_230810_d8e4094e-99a0-4cf8-af64-2f1e27c0b471_o.png&tipo=g\">";
		
	}
	
	@GetMapping("/superior/ads")
	public String superior() {
		
		return "<img src=\"https://cronos-media.sesisenaisp.org.br//api/media/1-0/files?img=img_155_231025_fbe01f7d-323b-4c84-8848-0481f1e75990_o.png&tipo=g\">";
		
	}
	
	@GetMapping("/superior/mec")
	public String mec() {
		
		return "<img src=\"https://cronos-media.sesisenaisp.org.br//api/media/1-0/files?img=img_155_231025_30288c7b-f6d7-446f-93b9-ea9b4b2a25d5_o.png&tipo=m\">";
		
	}
	
}
