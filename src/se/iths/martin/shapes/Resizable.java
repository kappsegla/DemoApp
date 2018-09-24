package se.iths.martin.shapes;

@FunctionalInterface
public interface Resizable<T> {
    void resize(T shape);
}
