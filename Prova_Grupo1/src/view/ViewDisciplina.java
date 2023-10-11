package view;

import java.util.List;
import model.ModelDisciplina;

public class ViewDisciplina {

	public void exibirListaDisciplinas(List<ModelDisciplina> disciplinas) {
		
		System.out.println("=====DISCIPLINAS=====");
		
		for(ModelDisciplina disciplina:disciplinas) {
			
			System.out.println("Sigla: "+disciplina.getSiglaDisciplina());
			System.out.println("Nome:"+disciplina.getNome());
			System.out.println("ementa"+disciplina.getEmenta());
			System.out.println("------------------");
		}
	}
	
	public void removerDisciplina(boolean disciplinaRemovida) {
		
		if(disciplinaRemovida) {
			System.out.println("Disciplina removida com sucesso!\n");
		}else {
			System.out.println("Disciplina não encontrada.\n");
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
