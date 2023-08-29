package view;

import java.util.List;

import model.Planeta_Model;

public class Planeta_View {
	
	public void mostrarPlaneta(List<Planeta_Model> listaPlaneta) {
		
		System.out.println("=======Planetas Registrados=======");
		
		for(Planeta_Model planeta : listaPlaneta) {
			
			System.out.println("Nome do planeta: "+planeta.getNome());
			
		}
		
		System.out.println("--------------------------------");
		
	}

}
