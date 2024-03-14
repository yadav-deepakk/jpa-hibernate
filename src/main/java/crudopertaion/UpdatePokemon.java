package crudopertaion;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Pokemon;

public class UpdatePokemon {
	public static boolean updatePokemonName(EntityManager entityManager, EntityTransaction transaction, Long id,
			String name) {
		Pokemon pokemon = entityManager.find(Pokemon.class, id);
		if (pokemon != null) {
			pokemon.setName(name);
			InsertPokemon.insertPokemon(pokemon, entityManager, transaction);
			System.out.println("Name Updation Successful. ");
		} else {
			System.out.println("No such pokemon found in database.");
			return false;
		}
		return true;
	}

	public static boolean updatePokemonType(EntityManager entityManager, EntityTransaction transaction, Long id,
			String type) {
		Pokemon pokemon = entityManager.find(Pokemon.class, id);
		if (pokemon != null) {
			pokemon.setType(type);
			InsertPokemon.insertPokemon(pokemon, entityManager, transaction);
			System.out.println("Type Updation Successful. ");

		} else {
			System.out.println("No such pokemon found in database.");
			return false;
		}
		return true;
	}

	public static boolean updatePokemonPower(EntityManager entityManager, EntityTransaction transaction, Long id,
			int power) {
		Pokemon pokemon = entityManager.find(Pokemon.class, id);
		if (pokemon != null) {
			pokemon.setPower(power);
			InsertPokemon.insertPokemon(pokemon, entityManager, transaction);
			System.out.println("Power Updation Successful. ");

		} else {
			System.out.println("No such pokemon found in database.");
			return false;
		}
		return true;
	}
}
