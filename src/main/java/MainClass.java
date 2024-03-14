import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import crudopertaion.SelectPokemon;
import crudopertaion.UpdatePokemon;
import crudopertaion.DeletePokemon;
import crudopertaion.InsertPokemon;
import entities.Pokemon;
import enums.PokemonColor;

public class MainClass {

	public static void main(String[] args) {

		// CRUD Operations
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();

		Pokemon pikachu = new Pokemon("Pikachu", "Electrical", 100, PokemonColor.YELLOW);
		Pokemon charlizard = new Pokemon("Charlizard", "Fire", 85, PokemonColor.ORANGE);
		Pokemon meowth = new Pokemon("Meowth", "Cat", 77, PokemonColor.CREAM);
		Pokemon[] pokemonArr = { pikachu, charlizard, meowth };

		// C - Create
		InsertPokemon.insertPokemons(pokemonArr, entityManager, transaction);

		// R - Read
		Pokemon pokemon1 = SelectPokemon.getPokemonById(entityManager, 1L);
		System.out.println(pokemon1);

		// U - Update
		UpdatePokemon.updatePokemonPower(entityManager, transaction, 1L, 150);
		UpdatePokemon.updatePokemonName(entityManager, transaction, 2L, "CharlieZaard");
		UpdatePokemon.updatePokemonType(entityManager, transaction, 3L, "cattt");
		UpdatePokemon.updatePokemonType(entityManager, transaction, 10L, "Fire"); // return false

		// D - Delete
		// DeletePokemon.deletePokemonById(entityManager, transaction, 3L); 
		// DeletePokemon.deletePokemonById(entityManager, transaction, 100L); 
	}

}
