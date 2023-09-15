package controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

import dao.Contato_Dao;
import model.Contato_Model;
import view.Contato_View;

public class Contato_Controller {

	private Contato_Dao contatoDao;
	private Contato_View contatoView;

	public Contato_Controller() {

		contatoDao = new Contato_Dao();
		contatoView = new Contato_View();

	}

	public void adicinarContatao(int id, String nome, String email, int telefone) {

		Contato_Model contatoModel = new Contato_Model(id, nome, email, telefone);

		contatoDao.adicionarContato(contatoModel);

	}

	public void exibirListaContato() {

		List<Contato_Model> listaContato = contatoDao.obterListaContato();

		contatoView.exibirListaContato(listaContato);

	}

	public void removerPais(String nomeContato) {

		for (Contato_Model contato : contatoDao.obterListaContato()) {

			if (contato.getNome().equalsIgnoreCase(nomeContato)) {

				contatoDao.remover(contato);

				break;

			}

		}
	}

	public void acharContatoNome(String nome) {

		try {

			Contato_Model contato = contatoDao.listaContatoNome(nome);

			if (contato == null) {

				System.out.println("Lista Vazia");

			}

			contatoView.exibirContato(contato);

		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}

	}

	public void acharContatoId(int id) {

		try {

			Contato_Model contato = contatoDao.listaContatoId(id);

			if (contato == null) {

				System.out.println("Lista vazia");

			}

			contatoView.exibirContato(contato);

		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}

	}

	public void editarContato(int id, int telefone, String nome, String email) {

		Contato_Model contatoModel = new Contato_Model(id, nome, email, telefone);

		contatoDao.editarContato(contatoModel);

	}

	public void testaConexao() {

		String msg;

		if (contatoDao.testaConexao()) {

			msg = "Conexao com o banco de dados bem-sucedida";

		} else {

			msg = "Nao foi possivel estabelecer conexao com o banco de dados.";

		}
		
		contatoView.exibirMensagem(msg);

	}

	public void menu() {
		int opcao = -1;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 0) {

			System.out.println("1.Testar Conexao");
			System.out.println("2.adicionar Contato");
			System.out.println("3.listar contatos");
			System.out.println("4.remover contato");
			System.out.println("5.buscar contato por nome");
			System.out.println("6.buscar contato por ID");
			System.out.println("7.atualizar contato");
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

				System.out.println("Informe o email: ");
				String email = entrada.next();

				entrada.nextLine();

				System.out.println("Informe o telefone: ");
				int telefone = entrada.nextInt();

				adicinarContatao(id, nome, email, telefone);
				break;

			case 3:
				exibirListaContato();
				break;

			case 4:

				System.out.println("Informe o nome: ");
				nome = entrada.next();

				removerPais(nome);

				entrada.nextLine();
				break;
				
			case 5:
				
				System.out.println("Informe o nome: ");
				nome = entrada.next();
				
				acharContatoNome(nome);
				
				entrada.nextLine();
				break;
				
			case 6:
				
				System.out.println("Informe o ID: ");
				id = entrada.nextInt();
				
				acharContatoId(id);
				break;
				
			case 7:
				
				System.out.println("Informe o ID: ");
				id = entrada.nextInt();

				System.out.println("Informe o nome: ");
				nome = entrada.next();

				entrada.nextLine();

				System.out.println("Informe o email: ");
				email = entrada.next();

				entrada.nextLine();

				System.out.println("Informe o telefone: ");
				telefone = entrada.nextInt();

				editarContato(id, telefone, nome, email);
				break;
				
			case 0:
				
				System.out.println("Saindo ...");
				break;

			}

		}

		entrada.close();
		
	}

}
