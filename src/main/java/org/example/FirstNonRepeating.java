package org.example;

import java.util.HashMap;

// find first non repeating char using hashmap
public class FirstNonRepeating {
    public static void main(String[] args){
        String str = "ssbb"; //"swiss";
        HashMap<Character,Integer> counts = new HashMap<>();
        for(char c : str.toCharArray()){
            counts.put(c, counts.getOrDefault(c,0)+1);
        }
        System.out.println(counts);
        for(char c : str.toCharArray()){
            if(counts.get(c)==1){
                System.out.println("First non repeating char "+ c);
                return;
            }
        }
        System.out.println("No non-repeating character");
    }
}
