package org.example.shape2;

public abstract class Shape {
    private String name;
    public Shape(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract double area();
    public void describe() {
        System.out.println("Name " + name + " with area " + area());
    }
}
