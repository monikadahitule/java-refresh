package org.example;

public class DivideByZero {
    public static void main(String[] args) {
        try {
            double num = 10.0 / 0;
            System.out.println(num);
            System.out.println("I'm in try block");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done!");
        }
    }
}
