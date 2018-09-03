package se.iths.martin;

public class Rectangle {
    //Fields
    private int width;
    private int height;
    private int color;
    private boolean square;

    //Getter for boolean value, called is instead of get
    public boolean isSquare(){
        return square;
    }

    //No backing field getter
    public int getArea()
    {
        return width * height;
    }

    //Getter method for field height
    public int getHeight() {
        return height;
    }

    public int getColor() {
        return color;
    }

    //Setter method for field height
    public void setHeight(int height) {
        this.height = height;
        checkSquare();
    }

    public void checkSquare() {
        if( this.height == this.width)
            square = true;
        else
            square = false;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setWidth(int newWidth) {
        if (newWidth > 0)
            width = newWidth;
        checkSquare();
    }

    public int getWidth() {
        return width;
    }
}
