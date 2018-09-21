package se.iths.martin.pokemon;

public class Muk extends Pokemon implements SlimeHandler {

    @Override
    public void talk() {
        System.out.println("Muk, muk, muk");
    }

    @Override
    public void attack() {
        System.out.println("Slime slime, you are slimed!");
        setHealth(getHealth() - 1);
    }

    @Override
    public String handleSlime(int amount) {
        return null;
    }
}
