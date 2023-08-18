package controller;

import java.util.ArrayList;
import java.util.List;

import model.Fornecedor;
import view.Fornecedor_View;

public class Fornecedor_Controller {

	private List<Fornecedor> forne;
	private Fornecedor_View forneV;

	public Fornecedor_Controller() {

		forne = new ArrayList();
		forneV = new Fornecedor_View();

	}

	public void addF(int idFornecedor, String nome, int CNPJ, String email) {

		Fornecedor fornes = new Fornecedor(idFornecedor, nome, CNPJ, email);

		forne.add(fornes);

	}

	public void mostrarFornecedor() {

		forneV.listaF(forne);

	}

	public void validarCPNJ(int idFornecedor, String nome, int CNPJ, String email) {
		Fornecedor fornes = new Fornecedor(idFornecedor, nome, CNPJ, email);

		if(forne.isEmpty()) {
			
			System.out.println("Lista vazia");
			
		}else {
			
			for(Fornecedor fornesce : forne) {
				
				if(fornesce.getCNPJ() == CNPJ){
					
					System.out.println("Bem vindo"+ fornesce.getNome());
					
				}else {
					
					
					System.out.println("CNPJ Incorreto");
					
				}
				
				
			}
			
			
		}
		
	}

}
