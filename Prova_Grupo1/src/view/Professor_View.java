package view;

import java.util.List;

import model.Professor_Model;

public class Professor_View {
	
	public void exibirProfessores(List<Professor_Model> listaProfessor) {
		
		System.out.println("======= Lista Professor =======");
		
		for(Professor_Model professorModel : listaProfessor) {
			
			System.out.println("Codigo: "+professorModel.getCodigo());
			System.out.println("Nome: "+professorModel.getNome());
			System.out.println("Codigo da Diciplina: "+professorModel.getCodigo_diciplina());
			System.out.println("Especialidade: "+professorModel.getEspecialidade());
			System.out.println("Data de Admissão: "+professorModel.getData_admissao());
			System.out.println("---------------------------------");
		}
		
		
	}
	
	
	public void exibirProfessor (List<Professor_Model> professorModel) {
		
		System.out.println("===== Professor =====");
			for(Professor_Model professorModel1 : professorModel) {
			System.out.println("Codigo: "+professorModel1.getCodigo());
			System.out.println("Nome: "+professorModel1.getNome());
			System.out.println("Codigo da Diciplina: "+professorModel1.getCodigo_diciplina());
			System.out.println("Especialidade: "+professorModel1.getEspecialidade());
			System.out.println("Data de Admissão: "+professorModel1.getData_admissao());
			System.out.println("---------------------------------");
		
		
	}
}
	
	
	public void exibirMensagem(String msg) {
		
		System.out.println(msg);
		
	}

}
