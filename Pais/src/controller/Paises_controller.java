package controller;

import java.util.List;

import dao.Pais_Dao;
import model.Paises;
import view.Paises_view;

public class Paises_controller {

	private Pais_Dao paisD;
	private Paises_view paisV;

	public Paises_controller() {

		paisD = new Pais_Dao();
		paisV = new Paises_view();

	}

	public void adicionar(String pais, String capital) {

		paisD.adicionar(pais, capital);

	}

	public void exibir() {

		paisV.exibir(paisD.obtemLista());

	}

	public void limpar() {

		paisD.limpar();

	}

	public void remover(int index) {

		paisD.remover(index);

	}

}
