package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class SortTester {
    public static void main(String[] args) {
        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(new Tester("Ravi",10));
        testers.add(new Tester("Ravi",11));
        testers.add(new Tester("Panduranga", 1));
        testers.add(new Tester("Kumar",0));

        for (Tester t : testers){
            t.describe();
        }

        testers.sort(Comparator.comparingInt(Tester::getBugFound).reversed());
        System.out.println("************************");
        for (Tester t : testers){
            t.describe();
        }

        testers.sort(Comparator.comparing(Tester::getName));
        System.out.println("************************");
        for (Tester t : testers){
            t.describe();
        }

        testers.sort(Comparator.comparing(Tester::getName).thenComparing(Comparator.comparingInt(Tester::getBugFound).reversed()));
        System.out.println("************************");
        for (Tester t : testers){
            t.describe();
        }

    }
}
