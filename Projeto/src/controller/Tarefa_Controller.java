package controller;

import java.util.List;
import java.util.Scanner;
import dao.Tarefa_Dao;
import model.Tarefa_Model;
import model.Tarefa_Model.Status;
import view.Tarefa_View;

public class Tarefa_Controller {

	private Tarefa_Dao tarefaDao;
	private Tarefa_View tarefaView;

	public Tarefa_Controller() {

		tarefaDao = new Tarefa_Dao();
		tarefaView = new Tarefa_View();

	}

	public void adicionarTarefa(int id, String titulo, String descricao, Enum<Status> status) {

		Tarefa_Model tarefa = new Tarefa_Model(id, titulo, descricao, status);

		tarefaDao.adicionarTarefa(tarefa);

	}

	public void exibirListaTarefa() {

		List<Tarefa_Model> listaTarefa = tarefaDao.obterListaTarefa();

		tarefaView.exibirListaTarefa(listaTarefa);

	}

	public void removerTarefa(int id) {

		for (Tarefa_Model tarefaModel : tarefaDao.obterListaTarefa()) {

			if (tarefaModel.getId() == id) {

				tarefaDao.remover(tarefaModel);
				break;

			}

		}

	}

	public void editarTarefa(int id, String titulo, String descricao, Enum<Status> status) {

		Tarefa_Model contatoModel = new Tarefa_Model(id, titulo, descricao, status);

		tarefaDao.editarTarefa(contatoModel);

	}

	public void finalizarTarefa(int id) {

		for (Tarefa_Model tarefaModel : tarefaDao.obterListaTarefa()) {

			if (tarefaModel.getId() == id) {

				tarefaDao.finalizarTarefa(tarefaModel);
				break;

			}

		}

	}

	public void menu() {
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {

			System.out.println("1.Testar Conexao");
			System.out.println("2.adicionar Tarefa");
			System.out.println("3.listar Tarefas");
			System.out.println("4.remover Tarefas");
			System.out.println("5.Finalizar Tarefa");
			System.out.println("6.Editar Status");
			System.out.println("0.sair");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				testaConexao();
				break;

			case 2:

				System.out.println("Informe o ID: ");
				int id = entrada.nextInt();

				System.out.println("Informe o Titulo: ");
				entrada.nextLine();
				String Titulo = entrada.nextLine();

				System.out.println("Informe o Descricao: ");
				String descricao = entrada.nextLine();

				adicionarTarefa(id, Titulo, descricao, null);
				break;

			case 3:
				exibirListaTarefa();
				break;

			case 4:

				System.out.println("Informe o ID: ");
				id = entrada.nextInt();

				removerTarefa(id);

				entrada.nextLine();
				break;

			case 5:

				System.out.println("Informe o ID: ");
				id = entrada.nextInt();

				finalizarTarefa(id);

				entrada.nextLine();
				break;

			case 6:

				System.out.println("Informe o ID da Tarefa");
				id = entrada.nextInt();

				System.out.println("Informe o Status da Tarefa(A,P,C)");
				Enum<Status> status = Status.valueOf(entrada.next().toUpperCase());

				editarTarefa(id, Titulo = "", descricao = "", status);

				break;

			case 0:

				System.out.println("Saindo ...");
				break;

			}

		}

		entrada.close();

	}

	public void testaConexao() {

		String msg;

		if (tarefaDao.testaConexao()) {

			msg = "Conexao com o banco de dados bem-sucedida";

		} else {

			msg = "Nao foi possivel estabelecer conexao com o banco de dados.";

		}

		tarefaView.exibirMensagem(msg);

	}

}
