package org.example;

public class ShapeDemo {
    public static void main(String[] args) {

        Shape[] shapes = {new Circle(5.5), new Rectangle(4,8)};
                for(Shape s:shapes){
                    s.publish();
                }

    }
}
