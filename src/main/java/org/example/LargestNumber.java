package org.example;

public class LargestNumber {
    public static void main(String[] args) {
        int[] num = {2,4,9,7};//{};//{3, 3, 3};//{5};//{-5, -2, -9};//{2,4,9,7};
        if (num.length != 0) {
            int max = num[0];
            for (int n : num) {
                if (n > max) {
                    max = n;
                }
            }
            System.out.println(max);
        } else{
            System.out.println("Array is empty");
        }
    }
}
