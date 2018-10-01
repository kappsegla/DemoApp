package se.iths.martin.notes.presenters;

public interface Presenter<T> {
    public String present(T obj);
}
