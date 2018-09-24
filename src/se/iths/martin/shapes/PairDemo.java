package se.iths.martin.shapes;


import se.iths.martin.Book;

class MyBook extends Book {

    public MyBook(String title, String author) {
        super(title, author);
    }

    public MyBook(String title) {
        super(title);
    }
}

public class PairDemo {

    public static void main(String[] args) {

        Pair<Book, Double> pair = new Pair<>(new Book("Författare", "Titel"), 10.0);
        printPair(pair);
    }

    public static void printPair(Pair<? super MyBook, ? extends Number> pair) {
        System.out.println(pair.getFirst() + " : " +
                pair.getSecond().intValue() * 2.0);
    }
}
