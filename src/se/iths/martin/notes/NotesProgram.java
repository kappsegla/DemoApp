package se.iths.martin.notes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotesProgram {

    private NotesHandler notesHandler = new NotesHandler();
    private Scanner scanner = new Scanner(System.in);

    public void run() {

        while (true) {
            printMenu();
            int choice = choiceInput(5);
            System.out.println(choice);
            if( choice == 0)
                break;
        }
    }

    private int choiceInput(int count) {
        int i = -1;
        while (i < 0 || i >= count) {
            try {
                i = scanner.nextInt();
            }catch (InputMismatchException ex){
                scanner.nextLine();
                System.out.println("Felaktigt val.");
            }
        }
        scanner.nextLine();
        return i;
    }

    private void printMenu() {
        System.out.println("NotesMenu\n============\n"
                + "1. Create new Note\n"
                + "2. View Note\n"
                + "3. Delete Note\n"
                + "4. Edit Note\n"
                + "0. Exit\n");
    }


    public static void main(String[] args) {
        NotesProgram notesProgram = new NotesProgram();
        notesProgram.run();
    }


}
