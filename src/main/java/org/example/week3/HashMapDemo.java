package org.example.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        List<String> testerNames = new ArrayList<>(List.of("Ravi", "Kumar", "Ravi", "Panduranga", "Kumar", "Kumar","Ravi"));
        testerNames.forEach(System.out::println);
        Map<String, Integer> countsMap = new HashMap<>();
        for (String name : testerNames){
            countsMap.put(name,countsMap.getOrDefault(name,0)+1);
        }
        System.out.println(countsMap);
        for(Map.Entry<String, Integer> entry : countsMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        //most frequent count
/*        String bestName = "";
        int bestCount = 0;
        for(Map.Entry<String,Integer> entry : countsMap.entrySet()){
            if(entry.getValue()> bestCount) {
                bestCount = entry.getValue();
                bestName = entry.getKey();
            }
        }*/
        //System.out.println("Most frequent name : "+ bestName + ", frequency : " + bestCount);
        int max = 0;
        for (int count : countsMap.values()) {
            if (count > max) {
                max = count;
            }
        }
        for (Map.Entry<String, Integer> entry : countsMap.entrySet()) {
            if (entry.getValue() == max) {
                System.out.println("Most frequent: " + entry.getKey() + " (" + max + ")");
            }
        }

        //distinct names count
        System.out.println("Count of distinct names:" + countsMap.size());

    }
}
