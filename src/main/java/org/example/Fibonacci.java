package org.example;


public class Fibonacci {
    public static void main(String[] args){
        // fibonacci 0 1 1 2 3 5 8
        int a = 0;
        int b = 1;
        int terms = 2;
        for (int i =0;i<terms;i++){
            System.out.println(a);
            int next = a + b;
            a = b;
            b = next;
        }

    }
}
