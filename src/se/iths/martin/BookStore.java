package se.iths.martin;

import java.util.ArrayList;

public class BookStore {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book("Pippi Långstrump","Astrid Lindgren"));
        books.add(new Book("The Stand"));

        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("Totalt antal böcker:" + Book.getNumberOfBooks());
    }
}
