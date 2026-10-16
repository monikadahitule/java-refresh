package org.example;

import java.util.HashSet;

public class UniqueHashSet {
    public static void main(String[] args) {
        HashSet<Integer> uniqueNumbers = new HashSet<>(); //TreeSet //LinkedHashSet
        int[] duplicates = {1, 2, 2, 3, 3, 3, 4};//{};//{4, 1, 4, 2, 1};//
        for (int num : duplicates){
            uniqueNumbers.add(num);
        }
        System.out.println(uniqueNumbers);
    System.out.println(uniqueNumbers.size());
    }
}
