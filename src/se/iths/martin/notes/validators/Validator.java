package se.iths.martin.notes.validators;

public interface Validator<T> {
    boolean validate(T obj);
}
