package view;

import java.util.List;
import model.Aluno_Telefone;

public class Aluno_Telefone_View {
	
	
	public void exibir_Aluno_Telefone(List<Aluno_Telefone> listaAlunoTelefone) {
		
		
		System.out.println("========= Lista de Telefone do Aluno =========");
		
		for(Aluno_Telefone alunoTelefone : listaAlunoTelefone) {
			
			System.out.println("Id do Telefone: "+alunoTelefone.getId_telefone());
			System.out.println("Id do Aluno: "+alunoTelefone.getAluno().getId_aluno());
			System.out.println("Telefone: "+alunoTelefone.getTelefone());
			
		}
		
		System.out.println("-------------------------------------------");
		
	}
	
	public void exibirId(Aluno_Telefone alunoTelefoneModel) {
		
		System.out.println("====== Aluno ======");
		System.out.println("Id do Telefone: "+alunoTelefoneModel.getId_telefone()+"\n"+
		"Id do Aluno: "+alunoTelefoneModel.getAluno().getId_aluno()+"\n"+
		"Telefone: "+alunoTelefoneModel.getTelefone());
		System.out.println("-----------------------");
		
	}

}
