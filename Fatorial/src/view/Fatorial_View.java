package view;

import java.util.List;

import model.Fatorial_Model;

public class Fatorial_View {

	public void exibir(List<Fatorial_Model> listaFatorial) {
		
		System.out.println("============ Ultimas 5 Operacoes feitas ============");
		
		for(Fatorial_Model fatorial : listaFatorial) {
			
			System.out.println("Fatorial: "+ fatorial.getFat());
			
		}

	

	}

}
