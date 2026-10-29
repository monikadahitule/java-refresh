package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        List<Tester> testers = new ArrayList<>();
        testers.add(new Tester("Ravi",10));
        testers.add(new Tester("Ravi",11));
        testers.add(new Tester("Panduranga",1));
        testers.add(new Tester("Kumar",0));

        Optional<Tester> first = testers.stream()
                .filter(t->t.getBugFound()>20)
                .findFirst();

        if(first.isPresent())
        {
            first.get().describe();
        } else {
            System.out.println("No value");
        }

        first.ifPresent(t->t.describe());

        String name = testers.stream()
                .filter(t->t.getBugFound()>20)
                .map(Tester::getName)
                .findFirst()
                .orElse("not found");
        System.out.println(name);
    }
}
