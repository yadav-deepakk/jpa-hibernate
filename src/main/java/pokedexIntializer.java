import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

import entities.Pokemon;

public class pokedexIntializer {

	public static void main(String[] args) {

		Pokemon pikachu = new Pokemon("Pikachu", "Electrical", 100);
		Pokemon charlizard = new Pokemon("Charlizard", "Fire", 85);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		entityManager.persist(pikachu);
		entityManager.persist(charlizard);
		transaction.commit();

	}

}
