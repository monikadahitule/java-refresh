package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        List<Tester> testers = new ArrayList<>();
        testers.add(new Tester("Ravi", 10));
        testers.add(new Tester("Ravi", 11));
        testers.add(new Tester("Panduranga", 1));
        testers.add(new Tester("Kumar", 0));

        testers.forEach(Tester::describe);
        System.out.println("********************");
        Predicate<Tester> hasManyBugs = t -> t.getBugFound() > 0;
        for (Tester t : testers) {
            if (hasManyBugs.test(t)) {
                t.describe();
            }
        }
        System.out.println("********************");
        Predicate<Tester> myNewRule = t -> t.getName().startsWith("R");
        for (Tester t : testers){
            if(myNewRule.test(t)){
                t.describe();
            }
        }


    }
}