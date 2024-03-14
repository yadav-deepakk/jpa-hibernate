package crudopertaion;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Pokemon;

public class DeletePokemon {
	public static boolean deletePokemonById(EntityManager entityManager, EntityTransaction transactoin, Long id) {

		Pokemon pokemon = SelectPokemon.getPokemonById(entityManager, id);
		if (pokemon != null) {
			transactoin.begin();
			entityManager.remove(pokemon);
			transactoin.commit();
			System.out.println("{" + pokemon + "}, has been deleted!!!");
		} else {
			System.out.println("No Such pokemon in database to delete.");
			return false;
		}

		return true;

	}
}
