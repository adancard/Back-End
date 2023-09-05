package controller;

import java.util.Scanner;

import dao.Pessoa_Dao;
import view.Pessoa_View;

public class Pessoa_Controller {

	private Pessoa_Dao pessoaDao;
	private Pessoa_View pessoaView;

	public Pessoa_Controller() {

		pessoaDao = new Pessoa_Dao();
		pessoaView = new Pessoa_View();

	}

	public void adicionaPessoa(String nome, String sexo, double peso, double altura, int idade) {

		pessoaDao.AddPeso(nome, sexo, peso, altura, idade);

	}

	public void calcularIMC(String nome) {

		pessoaDao.calculaIMC(nome);

	}

	public void mostrarAlfabetico() {

		pessoaView.listaPessoaAlfabetica(pessoaDao.obtemlista());

	}

	public void selecionaPessoa(String nome) {

		pessoaDao.selecionaPessoa(nome);

	}

	public void pessoaAlta() {

		pessoaDao.listaPessoaAlta();

	}

	public void pessoaBaixa() {

		pessoaDao.listaPessoaBaixa();

	}

	public void pessoaGorda() {

		pessoaDao.listaPessoaGorda();

	}

	public void pessoaMagra() {

		pessoaDao.listaPessoaMagra();

	}

	public void mediaIdadeHomem() {

		pessoaDao.mediaIdadeHomem();

	}

	public void mediaIdadeMulher() {

		pessoaDao.mediaIdadeMulher();

	}

	public void numeroParticipantes() {

		pessoaDao.quantidadePessoa();

	}

	public void maioresDezoito() {

		pessoaDao.maiorIdade();
	}

	public void maisVelho() {

		pessoaDao.mostrarMaisVelho();

	}

	public void menu() {

		int opcao = -1;
		Scanner entrada = new Scanner(System.in);

		while (opcao != 14) {
			System.out.println("===== Menu =====");
			System.out.println("0. adicionar pessoas");
			System.out.println("1. calcular o IMC");
			System.out.println("2. exibir os dados completos do usuário selecionado na lista");
			System.out.println("3. listar todos os participantes por ordem alfabética");
			System.out.println("4. ERROR 404");
			System.out.println("5. exibir a pessoa mais alta");
			System.out.println("6. exibir a pessoa mais baixa");
			System.out.println("7. exibir a pessoa mais pesada");
			System.out.println("8. exibir a pessoa mais leve");
			System.out.println("9. calcular a média de idade das mulheres");
			System.out.println("10. calcular a média de idade dos homens");
			System.out.println("11. calcular o número de participantes ");
			System.out.println("12. listar participantes maiores de 18 anos  ");
			System.out.println("13. listar os 5 participantes mais velhos");
			opcao = entrada.nextInt();

			switch (opcao) {

			case 0:

				System.out.println("Nome: ");
				String nome = entrada.next();

				entrada.nextLine();

				System.out.println("Sexo: ");
				String sexo = entrada.next();

				System.out.println("Peso: ");
				double peso = entrada.nextDouble();

				System.out.println("Altura: ");
				double altura = entrada.nextDouble();

				System.out.println("Idade: ");
				int idade = entrada.nextInt();

				adicionaPessoa(nome, sexo, peso, altura, idade);
				break;

			case 1:

				System.out.println("Nome: ");
				nome = entrada.next();

				calcularIMC(nome);
				break;

			case 2:

				System.out.println("Nome: ");
				nome = entrada.next();
				selecionaPessoa(nome);
				
				break;

			case 3:

				mostrarAlfabetico();
				break;

			case 4:

				System.out.println("esse aqui foi de F");
				break;

			case 5:

				pessoaAlta();
				break;

			case 6:

				pessoaBaixa();
				break;

			case 7:

				pessoaGorda();
				break;

			case 8:

				pessoaMagra();
				break;

			case 9:

				mediaIdadeMulher();
				break;

			case 10:

				mediaIdadeHomem();
				break;

			case 11:

				numeroParticipantes();
				break;

			case 12:

				maioresDezoito();
				break;

			case 13:

				maisVelho();
				break;

			case 14:

				System.out.println("Saindo...");
				break;

			default:

				System.out.println("Opcao invalida");

			}

		}

		entrada.close();
	}
}
