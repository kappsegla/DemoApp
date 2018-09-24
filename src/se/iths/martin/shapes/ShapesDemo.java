package se.iths.martin.shapes;

import se.iths.martin.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

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
        ((ArrayList<Shape>)shapes).get(0);
        for (Shape s : shapes) {
            s.resize(new Consumer<Shape>() {
                @Override
                public void accept(Shape shape) {
                    shape.setLength(shape.getLength() * 2.0);
                    shape.setHeight(shape.getHeight() * 2.0);
                }
            });
            System.out.println(s);
        }
    }
}
