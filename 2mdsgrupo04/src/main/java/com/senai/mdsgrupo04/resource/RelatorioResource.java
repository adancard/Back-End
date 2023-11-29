package com.senai.mdsgrupo04.resource;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.mdsgrupo04.repository.AlunoRepository;
import com.senai.mdsgrupo04.service.RelatorioService;
import jakarta.servlet.http.HttpServletResponse;

@RestController
public class RelatorioResource {
	@Autowired
	private RelatorioService relatorioService;
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@GetMapping("/api/relatorio")
    public void geraPDF(HttpServletResponse response) throws IOException {
    	response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);

        this.relatorioService.exporta(response, alunoRepository.findAll());
    }
}