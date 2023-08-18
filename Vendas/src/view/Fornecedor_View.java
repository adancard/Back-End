package view;

import java.util.List;

import model.Fornecedor;

public class Fornecedor_View {

	public void listaF(List<Fornecedor> forne) {

		System.out.println("=====Lista de Fornecedor====");

		for (Fornecedor fornes : forne) {

			System.out.println(
					"ID do fornecedor: " + fornes.getIdFornecedor() + " Nome do fornecedor: " + fornes.getNome()
							+ " CNPJ do fornecedor: " + fornes.getCNPJ() + " Email do forncedor: " + fornes.getEmail());

		}

		System.out.println("-----------------------------");

	}

}
