package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Rafael", "rafael@gmail.com");
		Pessoa p3 = new Pessoa(null, "Javas", "javas@gmail.com");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();

		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);

		entityManager.getTransaction().commit();

		System.out.println("Pronto");
	}
}
