package se.iths.martin.pokemon;

import java.util.*;

public class PokemonDemo {
    public static void main(String[] args) {

        List<Pokemon> pokemons = new ArrayList<>();
        pokemons.add(PokemonCenter.CreatePokemon("Pikachu"));
        pokemons.add(PokemonCenter.CreatePokemon("Muk"));
        pokemons.add(PokemonCenter.CreatePokemon("Muk"));

        pokemons.get(0).setHealth(20);
        pokemons.get(1).setHealth(2);

        //Comparator<Pokemon> comparator = new PokemonComparator();
        //pokemons.sort(comparator);

        //Short form with lambda
        //pokemons.sort((o1, o2) -> o1.getHealth() - o2.getHealth());

        //Method reference
        pokemons.sort(PokemonDemo::hejåhå);


        ListIterator<Pokemon> listIterator = pokemons.listIterator();
//        Iterator<Pokemon> iterator;
        while (listIterator.hasNext()) {
            //Get next Pokemon from list
            Pokemon p = listIterator.next();

            p.talk();
            //            if( p instanceof  Pikachu)
//                listIterator.remove();
        }


//
//
//
//        Pokemon pokemon = PokemonCenter.CreatePokemon("Pikachu");
//        pokemon.talk();
//        pokemon.attack();
//
//
//        if( pokemon instanceof Pikachu) {
//            //Pikachu pikachu = (Pikachu) pokemon;
//            System.out.println("YES, we are a Pikachu!");
//        }
//
//        pokemons.get(1).talk();
//        pokemons.get(1).attack();
//
//        pokemon = PokemonCenter.CreatePokemon("");
//        pokemon.talk();
//        pokemon.attack();

    }

    public static int hejåhå(Pokemon o1, Pokemon o2){
        return o1.getHealth() - o2.getHealth();
    }
}
