package dao;

import java.util.ArrayList;
import java.util.List;

import model.Fatorial_Model;

public class Fatorial_Dao {

	// Declarando lista para so pegar informacoes do pacote fatorial model
	private List<Fatorial_Model> listaFatorial;

	// construtor do pacote
	public Fatorial_Dao() {

		listaFatorial = new ArrayList<>();

	}

	/*
	 * 
	 * Metodo para adicionar os fatorial se a lista atingir um tamanho igual a 5 ele
	 * ira apaga o primerio resultado e ira adicionar a nova conta que foi feita
	 * 
	 */
	public void addNumero(int numero) {

		Fatorial_Model fatorialModel = new Fatorial_Model(numero);
		double fatorial;

		if (listaFatorial.size() == 5) {

			listaFatorial.remove(0);

			for (int cont = fatorialModel.getNumero(); cont >= 1; cont--) {

				fatorial = fatorialModel.getFat();

				fatorialModel.setFat(fatorial *= cont);

			}

			listaFatorial.add(fatorialModel);

		} else {

			for (int cont = fatorialModel.getNumero(); cont >= 1; cont--) {

				fatorial = fatorialModel.getFat();

				fatorialModel.setFat(fatorial *= cont);

			}

			listaFatorial.add(fatorialModel);

		}

	}

	
	//Metodo para retornar a lista
	public List<Fatorial_Model> obtemLista() {

		return listaFatorial;

	}

}
