package org.example;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "";//" a b ";//"a  b";//"Java is fun and java is powerful and fun";
        if(text.trim().isEmpty()){
            System.out.println("No words to count");
            return;
        }
        String[] words = text.trim().toLowerCase().split("\\s+");
        HashMap<String,Integer> wordCount = new HashMap<>();
        for(String word : words){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
        }
        System.out.println(wordCount);
        for (Map.Entry<String,Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + " comes " + entry.getValue() +" times ");
        }
    }
}
