package se.iths.martin.inheritance;

public class Cat extends Mammal {

    public boolean isSleepsInBed() {
        return sleepsInBed;
    }

    public void setSleepsInBed(boolean sleepsInBed) {
        this.sleepsInBed = sleepsInBed;
    }

    private boolean sleepsInBed;

    public Cat(){
        this(4);
    }

    public Cat(int legs)
    {
        super(legs);
    }
}
