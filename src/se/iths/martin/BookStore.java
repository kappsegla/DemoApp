package se.iths.martin;

import java.util.ArrayList;

public class BookStore {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("Totalt antal böcker:" + Book.getNumberOfBooks());

        Book b1 = new Book("Pippi Långstrump","Astrid Lindgren");
        books.add(b1);
        books.add(new Book("The Stand"));

//        for (int i = 0; i < books.size(); i++) {
//            Book b = books.get(i);
//            System.out.println(b);
//        }

        for (Book b : books) {
            System.out.println(b);
        }
        System.out.println("Totalt antal böcker:" + Book.getNumberOfBooks());

        b1.setAuthor("Unknown");
        b1.setTitle("Tom i bollen - en självbiografi");
        System.out.println("Test av get/set: " + b1.getAuthor()+" - " + b1.getTitle());
    }
}
