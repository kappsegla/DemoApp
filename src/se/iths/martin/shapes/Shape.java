package se.iths.martin.shapes;

import java.util.Objects;

public abstract class Shape {

    //Fields
    private double length;
    private double height;

    //region Getters/Setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    //endregion

    public abstract double getArea();

    public abstract double getPerimeter();

    //region Constructors
    public Shape(double length, double height){
        this.length = length;
        this.height = height;
    }

    //Copy constructor
    public Shape(Shape shape){
        this.length = shape.length;
        this.height = shape.height;
    }
    //endregion

    @Override
    public String toString() {
        String s = "Längd  : " + getLength()+"\n" +
                   "Höjd   : " + getHeight() +"\n" +
                   "Omkrets: " + getPerimeter()+"\n" +
                   "Area   : " + getArea()+"\n";
        return s;
    }
}
