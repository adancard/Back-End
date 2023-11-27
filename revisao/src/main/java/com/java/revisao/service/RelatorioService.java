package com.java.revisao.service;

import java.io.IOException;

import org.springframework.stereotype.Service;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import com.java.revisao.entity.Cadastro;
import jakarta.servlet.http.HttpServletResponse;

@Service
public class RelatorioService {

	public void exporta(HttpServletResponse response, Iterable<Cadastro> Cadastros) throws IOException {
		Document document = new Document();
		try {
			/*
			 * PdfWriter.getInstance: Este método estático é usado para obter uma instância do objeto PdfWriter, que é responsável 
			 * por escrever o conteúdo no documento PDF.

			 * document: É o objeto do tipo Document que representa o documento PDF que você está criando ou manipulando. O Document 
			 * é a estrutura básica para adicionar elementos como parágrafos, tabelas, imagens, etc., ao PDF.

			 * response.getOutputStream(): Este método obtém o fluxo de saída do objeto de resposta HTTP. No contexto de uma aplicação 
			 * web, response geralmente representa a resposta HTTP que será enviada de volta ao navegador do cliente.
			 */
			PdfWriter.getInstance(document, response.getOutputStream());
			
			// Inicia o documento
			document.open();

			// Adicione um logo tipo
			Image imagem = Image.getInstance("https://upload.wikimedia.org/wikipedia/commons/8/8c/SENAI_S%C3%A3o_Paulo_logo.png");
		    imagem.setAlignment(Element.ALIGN_CENTER);
		    imagem.scaleToFit(400, 100);
			document.add(imagem);
			
			// Adicione o título do relatório
			Font fonte1 = FontFactory.getFont(FontFactory.TIMES_ROMAN);
			fonte1.setSize(25);
			
			Paragraph titulo = new Paragraph("Titulo mt criativo", fonte1);
			titulo.setAlignment(Element.ALIGN_CENTER);
			document.add(titulo);
			
			document.add(new Paragraph(" "));
			
			// Adiciona uma tabela com informações dos países
			PdfPTable tabela = new PdfPTable(5); // 5 colunas para Código, Nome, Ordem, Sigla2 e Sigla3

			// Configuração das células da tabela
			Font fontHeader = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
			fontHeader.setSize(12);

			PdfPCell headerCell = new PdfPCell();
			headerCell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
			headerCell.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);

			String[] headers = { "Código", "Nome", "Idade", "CEP" };
			for (String header : headers) {
				headerCell.setPhrase(new Paragraph(header, fontHeader));
				tabela.addCell(headerCell);
			}

			// Adiciona dados dos países à tabela
			Font fontData = FontFactory.getFont(FontFactory.HELVETICA);
			fontData.setSize(10);

			for (Cadastro cadastro1 : Cadastros) {
                tabela.addCell(new Paragraph(String.valueOf(cadastro1.getCodigo()), fontData));
                tabela.addCell(new Paragraph(cadastro1.getNome(), fontData));
                tabela.addCell(new Paragraph(String.valueOf(cadastro1.getIdade()), fontData));
                tabela.addCell(new Paragraph(cadastro1.getCep()));
            }
			document.add(tabela);
			
		} catch (DocumentException e) {
			e.printStackTrace();
		} finally {
			document.close();
		}
	}
}
