package org.example;

public abstract  class Shape {
    public abstract double area();
    public void publish(){
        System.out.println("Im Shape with area " + area());
    }
}
