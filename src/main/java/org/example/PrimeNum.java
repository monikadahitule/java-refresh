package org.example;

public class PrimeNum {
    public static void main(String[] args) {
        // check if num is prime
        int num = -5; //7, 9, 2, 1, 0, 13, and -5
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }
}
