package controller;

import java.util.Scanner;

import dao.Tarefa_Dao;
import model.Tarefa_Model;
import model.Tarefa_Model.Estado;
import model.Tarefa_Model.Prioridade;
import view.Tarefa_View;

public class Tarefa_Controller {

	private Tarefa_Dao tarefaDao;
	private Tarefa_View tarefaView;

	public Tarefa_Controller() {

		tarefaDao = new Tarefa_Dao();
		tarefaView = new Tarefa_View();

	}

	public void adicionarTarefa(String titulo, String descricao, String data_vencimento, Enum<Prioridade> prioridade,
			Enum<Estado> estado) {

		Tarefa_Model tarefaModel = new Tarefa_Model(titulo, descricao, data_vencimento, prioridade, estado);

		tarefaDao.adicionarTarefa(tarefaModel);

	}

	public void atualizarTarefa(Integer id, String descricao, Enum<Prioridade> prioridade, Enum<Estado> estado) {

		tarefaDao.atualizarTarefa(id, descricao, prioridade, estado);

	}

	public void removerTarefa(Integer id) {

		Tarefa_Model tarefaModel = tarefaDao.acharPorId(id);

		tarefaDao.removerProfessor(tarefaModel);

	}

	public void listarTarefa(Integer id) {

		tarefaView.exibirTarefa(tarefaDao.buscarPorId(id));

	}

	public void listarTarefas() {

		tarefaView.exibirTarefas(tarefaDao.listarTarefas());

	}

	public void menu() {

		Scanner scanner = new Scanner(System.in);

		int opcao = -1;

		while (opcao != 0) {

			System.out.println("==== Menu ====");
			System.out.println("1. Adicionar Tarefa");
			System.out.println("2. Listar Todas Tarefas");
			System.out.println("3. Listar Tarefa Por ID");
			System.out.println("4. Atualizar Tarefa da lista");
			System.out.println("5. Remover Tarefa");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opcao: ");

			try {

				opcao = scanner.nextInt();

				switch (opcao) {

				case 1:

					scanner.nextLine();

					System.out.println("Informe o Titulo da Tarefa: ");
					String titulo = scanner.nextLine();

					System.out.println("Informe a Descricao da Tarefa: ");
					String descricao = scanner.nextLine();

					System.out.println("Informe a Data de Vencimento da Tarefa: ");
					String data_vencimento = scanner.next();

					System.out.println("Informe a Prioridade da Tarefa(A(Alta),M(Media),B(Baixa)): ");
					Enum<Prioridade> prioridade = Prioridade.valueOf(scanner.next().toUpperCase());

					adicionarTarefa(titulo, descricao, data_vencimento, prioridade, Estado.A);

					break;

				case 2:

					listarTarefas();
					break;

				case 3:

					System.out.println("Informe o Id da Tarefa: ");
					Integer id = scanner.nextInt();

					listarTarefa(id);

					break;

				case 4:

					System.out.println("Informe o Id da Tarefa: ");
					id = scanner.nextInt();

					scanner.nextLine();

					System.out.println("Informe o Titulo da Tarefa: ");
					titulo = scanner.nextLine();

					System.out.println("Informe a Descricao da Tarefa: ");
					descricao = scanner.nextLine();

					System.out.println("Informe a Prioridade da Tarefa(A(Alta),M(Media),B(Baixa)): ");
					prioridade = Prioridade.valueOf(scanner.next().toUpperCase());

					System.out.println("Informe o Estado da Tarefa(E(Em andamento),C(Concluido)): ");
					Enum<Estado> estado = Estado.valueOf(scanner.next().toUpperCase());

					atualizarTarefa(id, descricao, prioridade, estado);

					break;

				case 5:

					System.out.println("Informe o Id da Tarefa: ");
					id = scanner.nextInt();
					removerTarefa(id);

					break;

				case 0:
					System.out.println("Saindo...");
					break;

				default:
					System.out.println("Opcao inválida.");
					break;
				}
			} catch (java.util.InputMismatchException e) {
				System.out.println("Opcao invalida. Por favor, digite um numero inteiro valido.");
				scanner.nextLine();
			}
		}

		scanner.close();
	}

}
