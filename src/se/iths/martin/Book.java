package se.iths.martin;

import org.jetbrains.annotations.NotNull;

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

    public Book( String title, String author) {
        this.author = author;
        this.title = title;
        numberOfBooks++;
    }

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
