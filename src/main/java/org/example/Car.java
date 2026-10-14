package org.example;

public class Car extends Vehicle{
    private String brand;
    public Car(String brand){
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Car is starting with the key");
        //super.start();
    }
}
