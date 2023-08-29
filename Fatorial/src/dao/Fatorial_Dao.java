package dao;

import java.util.ArrayList;
import java.util.List;

import model.Fatorial_Model;

public class Fatorial_Dao {

	private List<Fatorial_Model> listaFatorial;

	public Fatorial_Dao() {

		listaFatorial = new ArrayList<>();

	}

	public void addNumero(int numero) {

		Fatorial_Model fatorialModel = new Fatorial_Model(numero);
		int fatorial;

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

	public List<Fatorial_Model> obtemLista() {

		return listaFatorial;

	}

}
