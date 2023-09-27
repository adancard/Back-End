package view;

import java.util.List;

import model.Tarefa_Model;

public class Tarefa_View {

	
	public void exibirListaTarefa(List<Tarefa_Model> listaTarefa) {
		
		System.out.println("===== Lista de Tarefa =====");
		
		
		for(Tarefa_Model tarefa : listaTarefa) {
			
			
			System.out.println("Id Tarefa: "+tarefa.getId());
			System.out.println("Nome da Tarefa: "+tarefa.getTitulo());
			System.out.println("Descricao Tarefa: "+tarefa.getDescricao());
			System.out.println("Status: "+tarefa.getStatus());
			
			System.out.println("--------------------------");
			
		}
		
		System.out.println("========================================");
		
	}
	
	public void exibirMensagem(String msg) {
			
			
			System.out.println(msg);
			
		}
	
}
