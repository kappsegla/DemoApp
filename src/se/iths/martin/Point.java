package se.iths.martin;

public class Point {
    private double x;
    private double y;

     public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public double distanceTo(Point other) {
        double a = other.x - x;
        double b = other.y - y;
        return Math.sqrt( a*a + b*b );
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
