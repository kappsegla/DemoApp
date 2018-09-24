package se.iths.martin.shapes;

public class Ellipse extends Shape {
    public Ellipse(double length, double height) {
        super(length, height);
    }

    public Ellipse(Shape shape) {
        super(shape);
    }

    @Override
    public double getArea() {
        return (getLength() / 2.0) * (getHeight() / 2.0) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        double a = getLength()/2.0;
        double b = getHeight()/2.0;
        //https://sv.wikipedia.org/wiki/Ellips_(matematik)#Omkrets
        return Math.PI * ( 3*(a+b) - Math.sqrt((3*a + b)*(a + 3*b)));
    }
}
