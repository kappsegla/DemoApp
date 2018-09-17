package se.iths.martin.pokemon;

public class Pikachu extends Pokemon{
    @Override
    public void talk() {
        System.out.println("Pikachu!!!");
    }

    @Override
    public void attack() {
        System.out.println("Lightning bolt, attack!!!");
    }
}
