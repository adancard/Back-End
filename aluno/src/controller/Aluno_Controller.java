package controller;

import java.sql.SQLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import dao.Aluno_Dao;
import dao.Aluno_Telefone_Dao;
import model.Aluno;
import model.Aluno_Telefone;
import view.Aluno_Telefone_View;
import view.Aluno_View;

public class Aluno_Controller {

	private Aluno_Dao alunoDao;
	private Aluno_View alunoView;
	private Aluno_Telefone_Dao alunoTelefoneDao;
	private Aluno_Telefone_View alunoTelefoneView;

	public Aluno_Controller() {

		alunoDao = new Aluno_Dao();
		alunoView = new Aluno_View();
		alunoTelefoneDao = new Aluno_Telefone_Dao();
		alunoTelefoneView = new Aluno_Telefone_View();

	}

	public void adicionarAluno(int id, String nome, int idade) {

		Aluno alunoModel = new Aluno(id, nome, idade);

		alunoDao.adicionarAluno(alunoModel);

	}

	public void adicionarTelefone(int id, Aluno aluno, String telefone) {

		Aluno_Telefone alunoTelefoneModel = new Aluno_Telefone(id, aluno, telefone);

		alunoTelefoneDao.adicionarTelefoneAluno(alunoTelefoneModel);

	}
	
	public void busacarTelefonePorIdAluno(int id) throws SQLException {
		
		try {

			Aluno_Telefone alunoTelefoneModel = alunoTelefoneDao.buscaTelefonesPorAluno(id);

			if (alunoTelefoneModel == null) {

				System.out.println("Lista Vazia");

			}

			alunoTelefoneView.exibirId(alunoTelefoneModel);

		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}
		
	}
	
	public void atualizarTelefone(String telefone, Aluno aluno) throws SQLException {
		
		Aluno_Telefone alunoTelefone = new Aluno_Telefone(0, aluno, telefone);
		
		alunoTelefoneDao.atualizaTelefones(alunoTelefone);
		
	}

	public void exibirListaAluno() {

		List<Aluno> listaAluno = alunoDao.listarAluno();

		alunoView.exibirAluno(listaAluno);
	}

	public void removerAluno(int id) {

		for (Aluno alunoModel : alunoDao.listarAluno()) {

			if (alunoModel.getId_aluno() == id) {

				alunoDao.removerAluno(alunoModel);
				break;
			}

		}

	}

	public void editarAluno(int id, String nome, int idade) {

		Aluno alunoModel = new Aluno(id, nome, idade);

		alunoDao.editarAluno(alunoModel);

	}

	public void acharPorId(int id) {

		try {

			Aluno alunoModel = alunoDao.listarId(id);

			if (alunoModel == null) {

				System.out.println("Lista Vazia");

			}

			alunoView.exibirId(alunoModel);

		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}
	}

	public int verificarID(int id) {

		for (Aluno alunoModel : alunoDao.listarAluno()) {

			if (alunoModel.getId_aluno() == id) {

				return alunoModel.getId_aluno();

			}

		}

		return 0;

	}

	public void testaConexao() {

		String msg;

		if (alunoDao.testaConexao()) {

			msg = "Conexao com o banco de dados bem-sucedida";

		} else {

			msg = "Nao foi possivel estabelecer conexao com o banco de dados.";

		}

		alunoView.exibirMensagem(msg);

	}

	public void menu() throws SQLException {
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {

			System.out.println("1.Testar Conexao");
			System.out.println("2.adicionar Aluno");
			System.out.println("3.Adicionar Telefone do Aluno");
			System.out.println("4.Buscar Telefone por ID");
			System.out.println("5.Atualizar Telefone");
			System.out.println("6.Exibir Lista");
			System.out.println("7.Achar Aluno por ID");
			System.out.println("8.Editar contato");
			System.out.println("9.Remover Aluno");
			System.out.println("0.sair");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 1:

				testaConexao();

				break;

			case 2:

				System.out.println("Informe o ID: ");
				int id = entrada.nextInt();

				System.out.println("Informe o nome: ");
				String nome = entrada.next();

				entrada.nextLine();

				System.out.println("Informe a Idade: ");
				int idade = entrada.nextInt();

				adicionarAluno(id, nome, idade);
				break;

			case 3:

				System.out.println("Informe o ID do Telefone: ");
				id = entrada.nextInt();

				System.out.println("Informe o ID do aluno");
				int idAluno = entrada.nextInt();
				
				if (verificarID(idAluno) == 0) {

					System.out.println("Id Incorreto");
					System.out.println("--------------------");
					break;

				} else {
					
					Aluno aluno = new Aluno(idAluno, null, 0);

					System.out.println("Informe o Telefone: ");
					String telefone = entrada.next();

					adicionarTelefone(id, aluno, telefone);
					break;
					
				}
				
			case 4:
				
				System.out.println("Informe o ID: ");
				id = entrada.nextInt();
				
				busacarTelefonePorIdAluno(id);
				break;
				
			case 5:
				
				System.out.println("Informe o ID do aluno: ");
				idAluno = entrada.nextInt();
				
				if (verificarID(idAluno) == 0) {

					System.out.println("Id Incorreto");
					System.out.println("--------------------");
					break;

				} else {
					
					Aluno aluno = new Aluno(idAluno, null, 0);

					System.out.println("Informe o Telefone: ");
					String telefone = entrada.next();

					atualizarTelefone(telefone,aluno);
					break;
					
				}
				
			
				

			case 6:

				exibirListaAluno();
				break;

			case 7:

				System.out.println("Informe o ID: ");
				id = entrada.nextInt();

				acharPorId(id);
				break;

			case 8:

				System.out.println("Informe o ID: ");
				id = entrada.nextInt();

				System.out.println("Informe o nome: ");
				nome = entrada.next();

				entrada.nextLine();

				System.out.println("Informe a Idade: ");
				idade = entrada.nextInt();

				editarAluno(id, nome, idade);
				break;

			case 9:

				System.out.println("Informe o Id: ");
				id = entrada.nextInt();

				removerAluno(id);
				break;

			case 0:

				System.out.println("Saindo ...");
				break;

			}

		}

		entrada.close();

	}

}
