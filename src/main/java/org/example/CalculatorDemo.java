package org.example;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();

        c1.add(2,3); //add(2, 3), add(2.5, 3.5)
        c1.add(2.4,1.5);
        c1.add(1,2,3);
    }
}
