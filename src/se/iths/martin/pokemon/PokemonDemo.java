package se.iths.martin.pokemon;

public class PokemonDemo {
    public static void main(String[] args) {
        Pokemon pokemon = PokemonCenter.CreatePokemon("Pikachu");
        pokemon.talk();
        pokemon.attack();

        pokemon = PokemonCenter.CreatePokemon("Muk");
        pokemon.talk();
        pokemon.attack();

    }
}
