package se.iths.martin.shapes;

import java.util.Objects;

public abstract class Shape {

    //Fields
    private double length;
    private double height;

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

    public abstract double getArea();

    public abstract double getPerimeter();

    public Shape(double length, double height){
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        String s = "Längd  : " + getLength()+"\n" +
                   "Höjd   : " + getHeight() +"\n" +
                   "Omkrets: " + getPerimeter()+"\n" +
                   "Area   : " + getArea()+"\n";
        return s;
    }
}
