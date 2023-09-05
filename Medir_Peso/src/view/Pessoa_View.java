package view;


import java.util.Comparator;
import java.util.List;

import model.Pessoa;

public class Pessoa_View {

	public void listaPessoaAlfabetica(List<Pessoa> listapessoa) {

		System.out.println("=========Lista em ordem alfabetica=========");
		
		listapessoa.sort(Comparator.comparing(Pessoa::getNome));
		
		for(Pessoa pessoa : listapessoa) {
			
			System.out.println("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso() + " Sexo: "
					+ pessoa.getSexo() + " Altura: " + pessoa.getAltura());

		}
		
		System.out.println("--------------------------------------");

	}
		

}
