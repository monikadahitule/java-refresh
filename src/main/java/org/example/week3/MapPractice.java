package org.example.week3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,String> phoneBook = new HashMap<>();
        phoneBook.put("Almira","4698576957698");
        phoneBook.put("Meera","957698");
        phoneBook.put("Ravi","48");
        phoneBook.put("Bala","48");
        phoneBook.put("Zian","4458");

        System.out.println("Ravi's number " + phoneBook.get("Ravi"));

        if(phoneBook.containsKey("Meera")){
            System.out.println("Yes its present");
        } else {
            System.out.println("No its not present");
        }

        phoneBook.remove("Ravi");
        System.out.println("Size:" + phoneBook.size());

        //sort by name
        Map<String,String> sortedBook = new TreeMap<>(phoneBook);
        for(Map.Entry<String,String> entry : sortedBook.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Removed key value :" + phoneBook.get("Ravi"));

    }
}
