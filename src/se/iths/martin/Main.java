package se.iths.martin;

import java.util.Scanner;

public class Main {

    /*
    Many
    lines
     */
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
/*
        //Jämförelse av textsträngar
        String nextLine = sc.nextLine();

        if (nextLine.equals("Hej") ) {
            System.out.println("Samma text");
        }
        else
        {
            System.out.println("Ej samma");
        }
*/
        for (int b = 40; b >= 30; b--) {
            System.out.println(b);
        }

        int value = 2;
        while( value < 13 ) {
            System.out.println(value);
            value += 2;
        }


    /*    //Rounding to nearest integer
        float value = sc.nextFloat();

        int nextLine = (int)(value + 0.5f);
*/
/*      System.out.println("Hello World!");
        System.out.println("Hello World!");
        int age = 5;

        System.out.println(age);

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(text);

        float tal = sc.nextFloat();
        System.out.println(tal);
*/

    }
}
