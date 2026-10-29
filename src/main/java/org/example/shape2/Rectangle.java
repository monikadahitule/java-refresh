package org.example.shape2;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String name,double width,double height){
        super(name);
        if(width <= 0 || height <= 0){
            throw new IllegalArgumentException("Width or Height must be greater than 0");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width*height;
    }
}
