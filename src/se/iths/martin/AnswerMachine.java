package se.iths.martin;

import java.util.Scanner;

public class AnswerMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String someText = "Say something: ";

        System.out.println(someText);

        String input = sc.nextLine();

        if(  input.equals("Name?") ){
            System.out.println("My name is Maja, what's yours?");
        }


    }
}
