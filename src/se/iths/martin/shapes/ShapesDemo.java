package se.iths.martin.shapes;

import java.util.ArrayList;
import java.util.List;

public class ShapesDemo {

    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();

        Shape shape = new Rectangle(10.0, 5.0);
        shapes.add(shape);
        shapes.add(new Ellipse(4.0, 3.0));
        shapes.add(new Rectangle(shape));

        for (Shape s :
                shapes) {
            System.out.println(s);
        }


    }
}
