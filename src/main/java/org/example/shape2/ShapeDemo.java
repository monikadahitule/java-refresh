package org.example.shape2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("CircleA",5));
        shapes.add(new Rectangle("RectangleA",3,4));
        shapes.add(new Triangle("TriangleA",6,4));
        try {
            shapes.add(new Circle("BadCircle", -6));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            shapes.add(new Rectangle("BadRectangle", -6, -4));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            shapes.add(new Triangle("BadTriangle", 6, -4));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        shapes.forEach(Shape::describe);
        System.out.println("**********************");
        shapes.forEach(s -> System.out.println(s.getName() + " area " + s.area()));
        System.out.println("**********************");
        Consumer<Shape> printMe = s -> s.describe();
        for(Shape s : shapes){
            printMe.accept(s);
        }

    }
}
