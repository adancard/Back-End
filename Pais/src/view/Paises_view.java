package view;

import java.util.List;

import model.Paises;

public class Paises_view {

	public void exibir(List<Paises> paises) {

		System.out.println("====Mostrar paises====");
		System.out.println("--------------------");

		for (Paises pais : paises) {
			System.out.println("Pais: " + pais.getPais() + "-capital: " + pais.getCapital());

		}
		System.out.println("---------------------");

	}

}
