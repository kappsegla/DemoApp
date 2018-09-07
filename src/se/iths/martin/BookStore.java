package se.iths.martin;

import java.util.ArrayList;

public class BookStore {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Astrid Lindgren", "Pippi Långstrump"));
        books.add(new Book("The Stand"));

        System.out.println("Totalt antal böcker:" + Book.getNumberOfBooks());

        for (Book b : books) {
            System.out.println(b);
        }
    }
}
