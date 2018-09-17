package se.iths.martin.computers;

public class ComputersDemo {

    public static void main(String[] args) {

        Computer c = new Computer();
        Computer c1 = new PC();
        PC pc1 = new PC();
        Computer c2 = new Macintosh();
        Macintosh macintosh = new Macintosh();

        System.out.println(c);


        c.printYourInventor();
        c1.printYourInventor();
        pc1.printYourInventor();
        c2.printYourInventor();
        macintosh.printYourInventor();
    }
}
