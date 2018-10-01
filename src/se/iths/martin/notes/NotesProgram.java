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
            switch (choice) {
                case 0:
                    return;
                case 1:
                    newNote();
                    break;
            }
        }
    }

    private void newNote() {
        System.out.println("Create Note\nTitle: ");
        String title = scanner.nextLine();
        System.out.println("Body: ");

        StringBuilder builder = new StringBuilder();
        String row = " ";

        while( row.length() > 0 ) {
            row = scanner.nextLine();
            builder.append(row);
        }
        Note note = notesHandler.createNote(title, builder.toString());
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
