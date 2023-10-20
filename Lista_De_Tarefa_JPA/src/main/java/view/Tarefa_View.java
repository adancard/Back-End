package view;

import java.util.List;

import model.Tarefa_Model;

public class Tarefa_View {

	public void exibirTarefa(Tarefa_Model tarefaModel) {

		System.out.println("-------------------");

		System.out.println("Id da Tarefa: " + tarefaModel.getId() + "\nTitulo da Tarefa: " + tarefaModel.getTitulo()
				+ "\nDescricao da Tarefa: " + tarefaModel.getDescricao() + "\nData de Vencimento da Tarefa: "
				+ tarefaModel.getData_vencimento() + "\nPrioridade da Tarefa: " + tarefaModel.getPrioridade()
				+ "\nEstado da Tarefa: " + tarefaModel.getEstado());

		System.out.println("------------------");

	}

	public void exibirTarefas(List<Tarefa_Model> listaTarefa) {

		System.out.println("====== Lista de Tarefa ======");

		for (Tarefa_Model tarefaModel : listaTarefa) {

			exibirTarefa(tarefaModel);

		}

	}

}
