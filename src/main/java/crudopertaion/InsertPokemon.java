package crudopertaion;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Pokemon;

public class InsertPokemon {
	public static void insertPokemons(Pokemon[] pokemons, EntityManager entityManager, EntityTransaction transaction) {
		transaction.begin();
		for (Pokemon pokemon : pokemons) {
			entityManager.persist(pokemon);
		}
		transaction.commit();
	}

	public static void insertPokemon(Pokemon pokemon, EntityManager entityManager, EntityTransaction transaction) {
		transaction.begin();
		entityManager.persist(pokemon);
		transaction.commit();
	}

}
