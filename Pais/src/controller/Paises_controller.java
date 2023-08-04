package controller;

import java.util.ArrayList;
import java.util.List;

import model.Paises;
import view.Paises_view;

public class Paises_controller {

	private List<Paises> listadePaises;
	private Paises_view paisview;

	public Paises_controller() {

		listadePaises = new ArrayList<>();
		paisview = new Paises_view();

	}

	public void adicionar(String pais, String capital) {

		Paises pais1 = new Paises(pais, capital);
		listadePaises.add(pais1);
	}

	public void exibir() {

		paisview.exibir(listadePaises);
		
	}

	public void limpar() {

		listadePaises.clear();

	}

	public void remover(int index) {

		listadePaises.remove(index);

	}

}
