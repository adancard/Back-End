package dao;

import java.util.ArrayList;
import java.util.List;
import model.Paises;

public class Pais_Dao {

	private List<Paises> listadePaises;

	public Pais_Dao() {

		listadePaises = new ArrayList<>();

	}

	public void adicionar(String pais, String capital) {

		Paises pais1 = new Paises(pais, capital);
		listadePaises.add(pais1);

	}

	public List<Paises> obtemLista() {

		return listadePaises;
	}

	public void limpar() {

		listadePaises.clear();

	}

	public void remover(int index) {

		listadePaises.remove(index);

	}

}
