package org.example.shape2;

public class Circle extends Shape{
    private double radius;
    public Circle(String name,double radius){
        super(name);
        if(radius <= 0){
            throw new IllegalArgumentException("Radius must be greater than 0");
        }
        this.radius = radius;
    }
    @Override
    public double area() {
        return Math.PI*radius*radius;
    }


}
