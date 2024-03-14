import crudopertaion.InsertPokemon;
import entities.Pokemon;

public class MainClass {

	public static void main(String[] args) {

		// CRUD Operations
		Pokemon pikachu = new Pokemon("Pikachu", "Electrical", 100);
		Pokemon charlizard = new Pokemon("Charlizard", "Fire", 85);
		Pokemon meowth = new Pokemon("Meowth", "Cat", 77);
		Pokemon[] pokemonArr = { pikachu, charlizard, meowth };

		// C - Create
		InsertPokemon.insertPokemon(pokemonArr);

		// R - Read

		// U - Update

		// D - Delete

	}

}
