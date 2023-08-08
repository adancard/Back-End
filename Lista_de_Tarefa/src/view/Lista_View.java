package view;

import java.util.List;

import model.Lista;

public class Lista_View {

	public void listar(List<Lista> lista) {

		System.out.println("=====Lista de Tarefas=====");

		for (Lista listas : lista) {

			System.out.println("Nome da tarefa: " + listas.getNome() + " Status da tarefa: " + listas.getStatus());

		}

		System.out.println("---------------------------");

	}

	public void menu() {

		System.out.println("=====Menu=====");
		System.out.println("1.Adicionar Tarefa");
		System.out.println("2.Listar Tarefa");
		System.out.println("3.Sair");

	}

	public void perguntaT() {

		System.out.println("Informe o nome da Tarefa: ");

	}

	public void perguntaS() {

		System.out.println("Informe o Status dela: ");
	}
	
	public void sair() {
		
		System.out.println("Saindo...");
	}

}
