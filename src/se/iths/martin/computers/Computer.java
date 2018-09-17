package se.iths.martin.computers;

public class Computer{
    public void printYourInventor() {
        System.out.println("Alan turing");
    }

    @Override
    public String toString() {
        return "Computer: { Inventor: Alan turing }";
    }
}

