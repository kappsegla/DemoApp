package se.iths.martin.pokemon;

import java.lang.management.RuntimeMXBean;
import java.util.ListIterator;

public class Pikachu extends Pokemon {

    @Override
    public void talk() {
        super.talk(); System.out.println("Pikachu!!!");
    }

    @Override
    public void attack() {
        System.out.println("Lightning bolt, attack!!!");
    }
}
