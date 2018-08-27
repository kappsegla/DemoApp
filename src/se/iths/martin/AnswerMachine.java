package se.iths.martin;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AnswerMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String someText = "Say something: ";

        while (true) {
            System.out.println(someText);
            String input = sc.nextLine();

            if (input.equals("Name?")) {
                System.out.println("My name is Maja, what's yours?");
            } else if (input.contains("Name")) {
                System.out.println("My name is Maja, what's yours?");
            } else if (input.equals("hej då")) {
                break;  //Avbryter while loopen och fortsätter med koden efter loopen.
                //return;  //Avslutar metoden, blir samma resultat i det här fallet
            } else if(input.contains("date") || input.contains("datum") ) {
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = new Date();
                System.out.println(dateFormat.format(date));
            }
            else {
                System.out.println("What?");
            }
        }
    }
}
