package se.iths.martin.pokemon;

//Abstract class, no instances can be created
public abstract class Pokemon{
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    Pokemon(){
        health = 10;
    }

    private int health;

    public void talk(){
        System.out.print("My health: " + health + " ");
    }

    //Must be overridden in subclass
    public abstract void attack();
}


