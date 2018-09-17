package se.iths.martin.pokemon;

public class PokemonCenter {

    public static Pokemon CreatePokemon(String type) {
        switch (type) {
            case "Pikachu":
                return new Pikachu();
            case "Muk":
                return new Muk();
            default:
                return new Pokemon();
        }
    }
}
