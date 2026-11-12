package org.example.week3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> people = new ArrayList<>(List.of("Ravi", "Rohan", "Meera", "Mohit", "Sita", "Rina"));
        Map<Character, List<String>> groups = new HashMap<>();
        for (String name : people) {
            char letter = name.charAt(0);
            groups.computeIfAbsent(letter,c->new ArrayList<>()).add(name);

        }
        System.out.println(groups);
    }
}
