package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ravi","Kumar","Ravi","Panduranga","Kumar")) ;
        System.out.println(names.size());
        names.forEach(System.out::println);

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames.size());
        uniqueNames.forEach(System.out::println);


        System.out.println(uniqueNames.add("Ravi"));      // false: Ravi is already in the set
        System.out.println(uniqueNames.add("Anita"));     // true: Anita is new
        System.out.println(uniqueNames.contains("Kumar")); // true

    }
}
