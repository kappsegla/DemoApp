package se.iths.martin;

import org.jetbrains.annotations.NotNull;

/**
 * A class that represents a book with title and author information.
 * @author Martin
 * @version 1.0
 * @since 0.1
 * @see BookStore
 */
public class Book {

    private static int numberOfBooks;

    public static int getNumberOfBooks(){
        return numberOfBooks;
    }

    @Override
    public String toString() {
        return author + " - " + title;
    }

    public String getAuthor() {
        return author;
    }

    /**
     * Constructor for initializing a new Book.
     * @param title Title of book.
     * @param author Author name.
     */
    public Book( String title, String author) {
        this.author = author;
        this.title = title;
        numberOfBooks++;


    }

    /**
     * @param title Title of book. Author will be No author by default.
     */
    public Book(String title){
        this(title, "No author");
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String author;
    private String title;



}
