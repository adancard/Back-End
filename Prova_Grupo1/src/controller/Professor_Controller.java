package controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import dao.Professor_Dao;
import model.Professor_Model;
import view.Professor_View;

public class Professor_Controller {

	private Professor_Dao professorDao;
	private Professor_View professorView;
	private ControllerDisciplina controllerDisciplina;

	public Professor_Controller() {

		professorDao = new Professor_Dao();
		professorView = new Professor_View();
		controllerDisciplina = new ControllerDisciplina();

	}

	public void adicionarProfessor(String codigo, String nome, String codigo_diciplina, String especialidade,
			String data_admissao) {

		Professor_Model professorModel = new Professor_Model(codigo, nome, codigo_diciplina, especialidade,
				data_admissao);

		professorDao.adicionarProfessor(professorModel);

	}

	public void exibirProfessor() {

		List<Professor_Model> listaProfessor = professorDao.exibirProfessores();

		professorView.exibirProfessores(listaProfessor);

	}

	public void removerProfessor(String codigo) {

		for (Professor_Model professorModel : professorDao.exibirProfessores()) {

			if (professorModel.getCodigo().equalsIgnoreCase(codigo)) {

				professorDao.removeProfessor(professorModel);

				break;

			}

		}

	}

	public void professorCodigo(String codigo) {

		try {

			List<Professor_Model> professorModel = professorDao.listarProfessor(codigo);

			if (professorModel == null) {

				System.out.println("Lista vazia");

			} else {

				professorView.exibirProfessor(professorModel);

			}

		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}

	}

	public void editarProfessor(String codigo, String nome, String codigo_diciplina, String especialidade,
			String data_admissao) {

		Professor_Model professorModel = new Professor_Model(codigo, nome, codigo_diciplina, especialidade,
				data_admissao);

		professorDao.editarProfessor(professorModel);

	}

	public void exibirEspecialidadeTI() {

		List<Professor_Model> listaProfessor = professorDao.exibirTI();

		professorView.exibirProfessores(listaProfessor);

	}

	public void exibirDataAdmissao() {

		List<Professor_Model> listaProfessor = professorDao.dataAdmissao();

		professorView.exibirProfessores(listaProfessor);

	}

	public void menu() {

		int opcao = -1;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {

			System.out.println("======== Menu ========");
			System.out.println("1. Cadastrar Diciplina");
			System.out.println("2. Cadastrar Professor");
			System.out.println("3. Listar Todas as Disciplinas");
			System.out.println("4. Listar Todos os Professores");
			System.out.println("5. Exibir Uma Diciplina");
			System.out.println("6. Exibir Um Professor");
			System.out.println("7. Deletar Uma Diciplina");
			System.out.println("8. Deletar Um Professor");
			System.out.println("9. Atualizar Uma Disciplina");
			System.out.println("10. Atualizar Um Professor");
			System.out.println("11. Exibir Professores com Especialidades de TI");
			System.out.println("12. Ordenar Professor por Data de Admissao");
			System.out.println("0. Sair");
			System.out.println("Escolha uma opcao: ");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				System.out.println("Sigla da disciplina:");
				String sigla = entrada.next();

				entrada.nextLine();

				System.out.println("Nome da disciplina: ");
				String nomeD = entrada.next();

				entrada.nextLine();

				System.out.println("ementa: ");
				String ementa = entrada.next();

				entrada.nextLine();

				controllerDisciplina.adicionarDisciplina(sigla, nomeD, ementa);

				break;

			case 2:

				System.out.println("Codigo do Professor:");
				String codigo = entrada.next();

				entrada.nextLine();

				System.out.println("Nome do Professor: ");
				String nome = entrada.next();

				entrada.nextLine();

				System.out.println("Codigo da Disciplina: ");
				String codigo_diciplina = entrada.next();

				entrada.nextLine();

				System.out.println("Especialidade:");
				String especialidade = entrada.next();

				entrada.nextLine();

				System.out.println("Data de Admissao");
				String data = entrada.next();

				entrada.nextLine();

				adicionarProfessor(codigo, nome, codigo_diciplina, especialidade, data);
				break;

			case 3:

				controllerDisciplina.exibirListaDisciplinas();
				break;

			case 4:

				exibirProfessor();
				break;

			case 5:

				System.out.println("Sigla da disciplina:");
				sigla = entrada.next();

				controllerDisciplina.listarDiciplina(sigla);

				break;

			case 6:

				System.out.println("Codigo do Professor:");
				codigo = entrada.next();

				professorCodigo(codigo);

				entrada.nextLine();

				break;

			case 7:

				System.out.println("Sigla da disciplina:");
				sigla = entrada.next();

				controllerDisciplina.removerDisciplina(sigla);

				break;

			case 8:

				System.out.println("Codigo do Professor:");
				codigo = entrada.next();

				removerProfessor(codigo);

				entrada.nextLine();

				break;

			case 9:

				System.out.println("Sigla da disciplina:");
				sigla = entrada.next();

				System.out.println("Nome da disciplina: ");
				nomeD = entrada.next();

				entrada.nextLine();

				System.out.println("ementa: ");
				ementa = entrada.next();

				controllerDisciplina.editarDisciplina(sigla, nomeD, ementa);

				break;

			case 10:

				System.out.println("Nome do Professor: ");
				nome = entrada.next();

				entrada.nextLine();

				System.out.println("Especialidade:");
				especialidade = entrada.next();

				entrada.nextLine();

				editarProfessor(null, nome, null, especialidade, null);
				break;

			case 11:

				exibirEspecialidadeTI();
				break;

			case 12:

				exibirDataAdmissao();
				break;

			case 0:

				System.out.println("Saindo...");
				break;

			}

		}
		
		entrada.close();

	}

}
