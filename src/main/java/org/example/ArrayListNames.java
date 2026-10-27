package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("abc");
        names.add("efg");
        names.add("xyz");
        names.add("nop");
        names.add("qrs");
        System.out.println("Length of ArrayList " + names.size());
        names.remove("efg");
        for (String name : names) {
            System.out.println(name);
        }

        //Collections.sort(names);
        //names.sort(Comparator.naturalOrder());
        names.sort(Comparator.reverseOrder());
        System.out.println("Length of ArrayList " + names.size());

        for (String name : names) {
            System.out.println(name);
        }
    }

}
