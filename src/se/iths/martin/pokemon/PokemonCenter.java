package se.iths.martin.pokemon;

public class PokemonCenter {

    private static Pokemon defaultPokemon = new Pokemon();

    public static Pokemon CreatePokemon(String type) {
        switch (type) {
            case "Pikachu":
                return new Pikachu();
            case "Muk":
                return new Muk2018();
            default:
                return defaultPokemon;
        }
    }
}
