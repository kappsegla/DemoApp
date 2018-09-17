package se.iths.martin.pokemon;

import java.util.ArrayList;

public class PokemonDemo {
    public static void main(String[] args) {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(PokemonCenter.CreatePokemon("Pikachu"));
        pokemons.add(PokemonCenter.CreatePokemon("Muk"));
        pokemons.add(PokemonCenter.CreatePokemon(""));

        Pokemon pokemon = PokemonCenter.CreatePokemon("Pikachu");
        pokemon.talk();
        pokemon.attack();

        pokemons.get(1).talk();
        pokemons.get(1).attack();

        pokemon = PokemonCenter.CreatePokemon("");
        pokemon.talk();
        pokemon.attack();

    }
}
