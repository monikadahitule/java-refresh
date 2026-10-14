package org.example;

public class VehicleCarDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Tesla");
        v1.start();

        Car c1 = new Car("Mercedes");
        c1.start();

        Vehicle v2 = new Car("Toyota");
        v2.start();
    }
}
