package se.iths.martin.computers;

public class PC extends Computer {
    @Override
    public void printYourInventor() {
        super.printYourInventor();
        System.out.println("Bill Gates");
    }
}
