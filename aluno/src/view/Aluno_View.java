package view;

import java.util.List;

import model.Aluno;

public class Aluno_View {
	
		public void exibirAluno(List<Aluno> lista_Aluno) {
			
			System.out.println("======= Lista de Aluno =========");
			
			for(Aluno aluno : lista_Aluno) {
				
				System.out.println("Id do Aluno: "+aluno.getId_aluno());
				System.out.println("Nome do Aluno: "+aluno.getNome());
				System.out.println("Idade do Aluno: "+aluno.getIdade());
				
			}
			
			System.out.println("----------------------------------");
			
		}
		
		public void exibirId(Aluno alunoModel) {
			
			System.out.println("====== Aluno ======");
			System.out.println("Id aluno: "+alunoModel.getId_aluno()+"\n"+
			"Nome: "+alunoModel.getNome()+"\n"+
			"idade: "+alunoModel.getIdade());
			System.out.println("-----------------------");
			
		}
		
		public void exibirMensagem(String msg) {
			
			System.out.println(msg);
			
		}

}
