package org.example.week3;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        List<String> names = List.of("Ravi", "Meera", "Ravi", "Sita", "Meera");
        Set<String> unique = new HashSet<>(names);
        System.out.println("names.size :" + names.size() + " HashSet unique.size :" + unique.size());
        System.out.println(unique);

        Set<String> uniqueLinked = new LinkedHashSet<>(names);
        System.out.println("names.size :" + names.size() + " LinkedHashSet unique.size :" + uniqueLinked.size());
        System.out.println(uniqueLinked);


        Set<String> uniqueTree = new TreeSet<>(names);
        System.out.println("names.size :" + names.size() + " TreeSet unique.size :" + uniqueTree.size());
        System.out.println(uniqueTree);

    }
}
