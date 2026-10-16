package org.example;

import java.util.HashMap;

public class HashMapWordCount {
    public static void main(String[] args) {
        String sentence = "a  b";//"";//"Java java JAVA";//"java is fun and java is powerful";
        if (sentence.isEmpty()) {
            System.out.println("No words to count");
            return;
        }
        HashMap<String, Integer> countsHashMap = new HashMap<>();
        String[] sentenceArray = sentence.toLowerCase().split("\\s+");
        for (String word : sentenceArray) {
            countsHashMap.put(word, countsHashMap.getOrDefault(word, 0) + 1);

        }
        System.out.println(countsHashMap);
    }
}
