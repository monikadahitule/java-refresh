package org.example;

public class Vehicle {
    private String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println(this.brand + " Vehicle Starting");
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        if (brand.length() != 0) {
            this.brand = brand;
        } else {
            System.out.println("Invalid input");
        }
    }
}
