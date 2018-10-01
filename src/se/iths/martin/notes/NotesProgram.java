package se.iths.martin.notes;

import se.iths.martin.notes.presenters.FullNotePresenter;
import se.iths.martin.notes.presenters.NotePresenter;
import se.iths.martin.notes.presenters.Presenter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotesProgram {

    private NotesHandler notesHandler = new NotesHandler();
    private Scanner scanner = new Scanner(System.in);
    private Presenter<Note> presenter;

    /**
     * @param presenter Takes a presenter object that will be used for presenting a Note.
     */
    public NotesProgram(Presenter<Note> presenter) {
        this.presenter = presenter;
    }


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
                case 2:
                    getNote();
                    break;
                case 3:
                    deleteNote();
                    break;
                case 4:
                    editNote();
                    break;
            }
        }
    }

    private void editNote() {
    }

    private void deleteNote() {
        Note note = searchForNote();
        if (note.getTitle().length() == 0)
            System.out.println("no note with that title found");
        else {
            notesHandler.deleteNote(note);
        }
    }

    private Note searchForNote() {
        System.out.print("Search for Note\nTitle to search for: ");
        String title = scanner.nextLine();
        return notesHandler.getNote(title);
    }

    private void getNote() {
        Note note = searchForNote();
        if (note.getTitle().length() == 0)
            System.out.println("no note with that title found");
        else {
            System.out.println(presenter.present(note));
        }
    }

    private void newNote() {
        System.out.println("Create Note\nTitle: ");
        String title = scanner.nextLine();
        System.out.println("Body: ");

        StringBuilder builder = new StringBuilder();
        String row = " ";

        while (row.length() > 0) {
            row = scanner.nextLine();
            builder.append(row);
            builder.append('\n');
        }
        Note note = notesHandler.createNote(title, builder.toString());
    }

    private int choiceInput(int count) {
        int i = -1;
        while (i < 0 || i >= count) {
            try {
                i = scanner.nextInt();
            } catch (InputMismatchException ex) {
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
        Presenter<Note> notePresenter = new FullNotePresenter();
        NotesProgram notesProgram = new NotesProgram(notePresenter);
        notesProgram.run();
    }


}
