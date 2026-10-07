package org.example;

public class FizzBuzz {
    //Print numbers 1 to 50, but print "Fizz" for multiples of 3, "Buzz"
    // for multiples of 5, and "FizzBuzz" for multiples of both.
    public static void main(String[] args){
        for(int i = 1; i <= 50; i++){
            if (i%15 == 0){  //if ((i%3 == 0) && (i%5 == 0)){
                System.out.println("FizzBuzz");
            } else if (i%3 == 0){
                System.out.println("Fizz");
            } else if(i%5 == 0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
