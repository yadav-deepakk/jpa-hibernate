package crudopertaion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entities.Pokemon;

public class InsertPokemon {
	public static void insertPokemon(Pokemon[] pokemons) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		transaction.begin();
		for (Pokemon pokemon : pokemons) {
			entityManager.persist(pokemon);
		}
		transaction.commit();
	}

}
