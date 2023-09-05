package dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Pessoa;

public class Pessoa_Dao {

	private List<Pessoa> listapessoa;
	private double maxAltura = 0;
	private double minAltura = 1000;
	private double maxPeso;
	private double minPeso = 1000;
	private int somaIdadeHomem;
	private int mediaIdadeHomem;
	private int somaIdadeMulher;
	private int mediaIdadeMulher;
	private String homem = "homem";
	private String mulher = "mulher";

	public Pessoa_Dao() {

		listapessoa = new ArrayList<>();

	}

	public void AddPeso(String nome, String sexo, double peso, double altura, int idade) {

		Pessoa pessoa = new Pessoa(nome, sexo, peso, altura, idade);

		listapessoa.add(pessoa);

		if (altura > maxAltura) {

			maxAltura = altura;

		} else if (altura < minAltura) {

			minAltura = altura;

		}

		if (peso > maxPeso) {

			maxPeso = peso;

		} else if (peso < minPeso) {

			minPeso = peso;

		}

		if (homem == sexo) {

			somaIdadeHomem += idade;

		} else if (mulher == sexo) {

			somaIdadeMulher += idade;

		}

	}

	public void calculaIMC(String nome) {

		for (Pessoa pessoa : listapessoa) {

			if (pessoa.getNome().equals(nome)) {

				double imc = pessoa.getPeso() / (Math.pow(pessoa.getAltura(), 2));

				System.out.println("Nome: " + pessoa.getNome() + "IMC: " + imc);

			} else {

				System.out.println("Nome nao encontrado");

			}

		}

	}

	public void selecionaPessoa(String nome) {

		System.out.println("====== Menu Pessoal ======");

		for (Pessoa pessoa : listapessoa) {

			if (pessoa.getNome().equals(nome)) {

				System.out.println("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso() + " Sexo: "
						+ pessoa.getSexo() + " Altura: " + pessoa.getAltura());

			} else {

				System.out.println("Nome nao encontrado");

			}

		}

		System.out.println("---------------------------------------");

	}

	public void listaPessoaAlta() {

		System.out.println("====== Maior altura ======");

		for (Pessoa pessoa : listapessoa) {

			if (pessoa.getAltura() == maxAltura) {

				System.out.println("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso() + " Sexo: "
						+ pessoa.getSexo() + " Altura: " + pessoa.getAltura());

			}

		}

	}

	public void listaPessoaBaixa() {

		System.out.println("====== Menor Altura ======");

		for (Pessoa pessoa : listapessoa) {

			if (pessoa.getAltura() == minAltura) {

				System.out.println("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso() + " Sexo: "
						+ pessoa.getSexo() + " Altura: " + pessoa.getAltura());

			}

		}

	}

	public void listaPessoaGorda() {

		System.out.println("====== Maior Peso ======");

		Pessoa maxPeso = Collections.max(listapessoa, (p1, p2) -> Double.compare(p1.getPeso(), p2.getPeso()));

		System.out.println(maxPeso);

		System.out.println("------------------------------------------------");

	}

	public void listaPessoaMagra() {

		System.out.println("====== Menor Peso ======");

		for (Pessoa pessoa : listapessoa) {

			if (listapessoa.contains(minPeso)) {

				System.out.println("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso() + " Sexo: "
						+ pessoa.getSexo() + " Altura: " + pessoa.getAltura());

			}

		}

		System.out.println("------------------------------------------------");

	}

	public void mediaIdadeHomem() {

		mediaIdadeHomem = somaIdadeHomem / listapessoa.size();

		System.out.println("Media de idade Homem: " + mediaIdadeHomem);

	}

	public void mediaIdadeMulher() {

		mediaIdadeMulher = somaIdadeMulher / listapessoa.size();

		System.out.println("Media de idade Homem: " + mediaIdadeMulher);

	}

	public void quantidadePessoa() {

		System.out.println(listapessoa.size());

	}

	public void maiorIdade() {

		for (Pessoa pessoa : listapessoa) {

			if (pessoa.getIdade() > 18) {

				System.out.println("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso() + " Sexo: "
						+ pessoa.getSexo() + " Altura: " + pessoa.getAltura());

			}

		}

	}

	public void mostrarMaisVelho() {

		Collections.sort(listapessoa, Comparator.comparingInt(Pessoa::getIdade).reversed());

		for (Pessoa pessoa : listapessoa) {

			if (listapessoa.size() < 5) {

				System.out.println("Nome: " + pessoa.getNome() + " Peso: " + pessoa.getPeso() + " Sexo: "
						+ pessoa.getSexo() + " Altura: " + pessoa.getAltura());

			}
		}
	}

	public List<Pessoa> obtemlista() {

		return listapessoa;

	}

}
