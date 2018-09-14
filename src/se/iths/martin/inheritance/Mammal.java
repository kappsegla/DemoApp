package se.iths.martin.inheritance;

public class Mammal {
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public Mammal(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    private int numberOfLegs;
}
