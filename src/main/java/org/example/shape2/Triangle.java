package org.example.shape2;

public class Triangle extends Shape{
    private double base;
    private double height;
    public Triangle(String name,double base,double height){
        super(name);
        if(base <= 0 || height <= 0){
            throw new IllegalArgumentException("base or height must be greater than 0");
        }
        this.height = height;
        this.base = base;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}
