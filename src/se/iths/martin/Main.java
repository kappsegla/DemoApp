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

        //Jämförelse av textsträngar
        String a = sc.nextLine();

        if (a.equals("Hej") ) {
            System.out.println("Samma text");
        }
        else
        {
            System.out.println("Ej samma");
        }



    /*    //Rounding to nearest integer
        float value = sc.nextFloat();

        int a = (int)(value + 0.5f);
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
