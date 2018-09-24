package se.iths.martin.shapes;

public class Rectangle extends Shape {

    //region Constructors
    public Rectangle(double length, double height) {
        super(length, height);
    }

    public Rectangle(Shape shape) {
        super(shape);
    }
    //endregion

    @Override
    public double getArea() {
        return getLength() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return getLength() * 2 + getHeight() * 2;
    }
}
