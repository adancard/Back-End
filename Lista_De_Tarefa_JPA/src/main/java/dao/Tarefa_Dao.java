package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import model.Tarefa_Model;
import model.Tarefa_Model.Estado;
import model.Tarefa_Model.Prioridade;

public class Tarefa_Dao {

	private EntityManagerFactory produtorDeEntidades = Persistence.createEntityManagerFactory("exemplo-jpa");

	private EntityManager gerenciadorEntidades;

	public Tarefa_Dao() {

		gerenciadorEntidades = produtorDeEntidades.createEntityManager();

	}

	public void adicionarTarefa(Tarefa_Model tarefaModel) {

		gerenciadorEntidades.getTransaction().begin();
		gerenciadorEntidades.persist(tarefaModel);
		gerenciadorEntidades.getTransaction().commit();

	}

	public Tarefa_Model acharPorId(Integer id) {

		return gerenciadorEntidades.find(Tarefa_Model.class, id);

	}

	public void atualizarTarefa(Integer id, String descricao, Enum<Prioridade> prioridade, Enum<Estado> estado) {

		Tarefa_Model tarefaModel = acharPorId(id);

		gerenciadorEntidades.getTransaction().begin();
		tarefaModel.setDescricao(descricao);
		tarefaModel.setPrioridade(prioridade);
		tarefaModel.setEstado(estado);
		gerenciadorEntidades.getTransaction().commit();

	}

	public Tarefa_Model buscarPorId(Integer id) {

		return gerenciadorEntidades
				.createQuery("SELECT p FROM Tarefa_Model p WHERE p.id = :id", Tarefa_Model.class)
				.setParameter("id", id).getSingleResult();

	}
	
	public List<Tarefa_Model> listarTarefas(){
		
		  try {
	            return gerenciadorEntidades.createQuery("SELECT p FROM Tarefa_Model p", Tarefa_Model.class)
	                    .getResultList();
	        }catch (NoResultException e) {
	            throw new EntityNotFoundException("Nenhum Tarefa encontrado.");
	        }
		
	}

	public void removerProfessor(Tarefa_Model tarefaModel) {

		gerenciadorEntidades.getTransaction().begin();
		tarefaModel = gerenciadorEntidades.merge(tarefaModel);
		gerenciadorEntidades.remove(tarefaModel);
		gerenciadorEntidades.getTransaction().commit();

	}

	public void fechar() {

		gerenciadorEntidades.close();
		produtorDeEntidades.close();

	}

}
