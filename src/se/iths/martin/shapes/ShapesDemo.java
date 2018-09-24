package se.iths.martin.shapes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShapesDemo {

    static List<Shape> shapes = new ArrayList<>();

    public static void main(String[] args) {
        Shape shape = new Rectangle(10.0, 5.0);
        shapes.add(shape);
        shapes.add(new Ellipse(4.0, 3.0));
        shapes.add(new Rectangle(shape));

        shapes.sort(new Comparator<Shape>() {
            @Override
            public int compare(Shape o1, Shape o2) {
                return Double.compare(o1.getArea(), o2.getArea());
            }
        });
//
//        Resizable resizable = new Resizable() {
//            @Override
//            public void resize(Shape shape) {
//                shape.setLength(shape.getLength() * 2.0);
//                shape.setHeight(shape.getHeight() * 2.0);
//            }
//        };

        //shapes.forEach(resizable::resize);

        for (Shape s : shapes) {
            s.resize(new Resizable() {
                @Override
                public void resize(Shape shape) {
                    shape.setLength(shape.getLength() * 2.0);
                    shape.setHeight(shape.getHeight() * 2.0);
                }
            });

            System.out.println(s);
        }
    }
}
