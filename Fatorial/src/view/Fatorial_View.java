package view;

import java.util.List;

import model.Fatorial_Model;

public class Fatorial_View {

	//Metodo para poder exibir a lista inteira
	public void exibir(List<Fatorial_Model> listaFatorial) {
		
		System.out.println("============ Ultimas 5 Operacoes feitas ============");
		
		for(Fatorial_Model fatorial : listaFatorial) {
			
			System.out.println("Numero Fatorado: "+fatorial.getNumero()+" Fatorial: "+ fatorial.getFat());
			
		}

	

	}

}
