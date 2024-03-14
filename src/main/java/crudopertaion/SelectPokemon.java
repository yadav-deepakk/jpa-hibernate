package crudopertaion;

import javax.persistence.EntityManager;

import entities.Pokemon;

public class SelectPokemon {
	public static Pokemon getPokemonById(EntityManager entityManager, Long id) {
		return entityManager.find(Pokemon.class, id);
	}
}
