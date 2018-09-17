package se.iths.martin.pokemon;

public class Muk extends Pokemon {
    @Override
    public void talk() {
        System.out.println("Muk, muk, muk");
    }

    @Override
    public void attack() {
        System.out.println("Slime slime, you are slimed!");
    }
}
