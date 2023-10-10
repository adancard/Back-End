package view;

import java.util.List;

import model.ModelDisciplina;
import model.Professor_Model;

public class ViewDisciplina {

	public void exibirListaDisciplinas(List<ModelDisciplina> disciplinas) {
		
		System.out.println("=====DISCIPLINAS=====");
		
		for(ModelDisciplina disciplina:disciplinas) {
			
			System.out.println("Sigla: "+disciplina.getSiglaDisciplina());
			System.out.println("Nome: "+disciplina.getNome());
			System.out.println("ementa: "+disciplina.getEmenta());
			System.out.println("------------------");
		}
		
	
		
	}
	
	public void exibirDisciplina(List<ModelDisciplina> lista) {
		
		System.out.println("===== Disciplina =====");
		for(ModelDisciplina diciplina : lista) {
		System.out.println("Sigla : "+diciplina.getSiglaDisciplina());
		System.out.println("Nome: "+diciplina.getNome());
		System.out.println("Ementa: "+diciplina.getEmenta());
		System.out.println("---------------------------------");
	
	
}
	}
	
}
