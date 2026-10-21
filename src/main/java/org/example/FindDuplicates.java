package org.example;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        int[] nums = {4, 1, 4, 2, 1, 5};//{};//{7, 7, 7, 7};//{1, 2, 3};
        for (int num : nums){
            if (!seen.add(num)){
               duplicates.add(num);
            }
        }
        System.out.println(duplicates);
    }
}
