package se.iths.martin.inheritance;

public class InheritanceDemo {

    public static void main(String[] args) {

        Cat cat = new Cat(4);

        Mammal mammal = new Cat();

        ((Cat) mammal).setSleepsInBed(true);

        Sphinx sphinx = new Sphinx();

        Cat cat1 = sphinx;
        Mammal mammal1 = sphinx;
        Object o = sphinx;



    }
}
