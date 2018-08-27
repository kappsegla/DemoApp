package se.iths.martin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AnswerMachine {

    //Method overloading
    //Method name + number of parameters and parameter type is method signature
    //Return type is not included

    public static int addTwoNumbers(int numberOne, int numberTwo ) {
        return numberOne + numberTwo;
    }

    public static int addTwoNumbers(double numberOne, double numberTwo ) {
        return (int) numberOne + (int) numberTwo;
    }

    public static int addTwoNumbers(int numberOne) {
        return numberOne + 10;
    }

    public static int doSomething() {
        int i = 1;
        i++;
        return i;
    }

    public static void printYourName() {
        System.out.println("My name is Maja, what's yours?");
    }

    public static void printCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String someText = "Say something: ";

        while (true) {
            System.out.println(someText);
            String input = sc.nextLine();

            if (input.equals("Name?")) {
                printYourName();
            } else if (input.contains("Name")) {
                printYourName();
            } else if (input.equals("hej då")) {
                break;  //Avbryter while loopen och fortsätter med koden efter loopen.
                //return;  //Avslutar metoden, blir samma resultat i det här fallet
            } else if (input.contains("date") || input.contains("datum")) {
                printCurrentDate();
            }else if (input.equals("!")){
                int answer = addTwoNumbers(10.0, 10.0);
            }
            else if(input.startsWith("mul")){

                //Parses a string with format "mul 4" into integer
                int tabell = Integer.parseInt( input.substring(4) );

                printMultiplicationTable(tabell);

          /*      int i = 1;
                while(i < 11){
                    System.out.println( tabell + " * " + i + " = " + tabell * i);
                    i++;
                }
                */
            }
            else {
                System.out.println("What?");
            }
        }
    }

    public static void printMultiplicationTable(int tabell) {
        for( int i = 1; i < 11 ; i++ )
        {
            System.out.println( tabell + " * " + i + " = " + tabell * i);
        }
    }

}
