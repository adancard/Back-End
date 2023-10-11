package controller;

import java.util.List;
import java.util.NoSuchElementException;
import dao.DaoDisciplina;
import model.ModelDisciplina;
import view.ViewDisciplina;

public class ControllerDisciplina {

	private DaoDisciplina daoDisciplina;
	private ViewDisciplina viewDisciplina;

	public ControllerDisciplina() {

		daoDisciplina = new DaoDisciplina();
		viewDisciplina = new ViewDisciplina();
	}

	public void adicionarDisciplina(String siglaDisciplina, String nome, String ementa) {

		ModelDisciplina listaDisciplina = new ModelDisciplina(siglaDisciplina, nome, ementa);

		daoDisciplina.adicionarDisciplina(listaDisciplina);
	}

	public void exibirListaDisciplinas() {

		List<ModelDisciplina> listaDisciplina = daoDisciplina.exibirDisciplinas();
		viewDisciplina.exibirListaDisciplinas(listaDisciplina);
	}

	public void removerDisciplina(String sigla) {

		for (ModelDisciplina listaDisciplina : daoDisciplina.exibirDisciplinas()) {

			if (listaDisciplina.getNome().equalsIgnoreCase(sigla)) {

				daoDisciplina.removeDisciplinas(listaDisciplina);
				break;
			}
		}
	}

	public void editarDisciplina(String sigla, String nome, String ementa) {

		ModelDisciplina disciplina = new ModelDisciplina(sigla, nome, ementa);

		daoDisciplina.editarDiciplina(disciplina);

	}

	public void listarDiciplina(String sigla) {

		try {

			List<ModelDisciplina> diciplina = daoDisciplina.listarDisciplina(sigla);

			if (diciplina == null) {

				System.out.println("Lista vazia");

			} else {

				viewDisciplina.exibirDisciplina(diciplina);

			}

		} catch (NoSuchElementException e) {

			e.printStackTrace();

		}

	}
}
