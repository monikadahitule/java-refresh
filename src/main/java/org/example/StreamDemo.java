package org.example;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Tester> testers = new ArrayList<>();
        testers.add(new Tester("Ravi",10));
        testers.add(new Tester("Ravi",11));
        testers.add(new Tester("Panduranga",1));
        testers.add(new Tester("Kumar",0));


        testers.stream()
                .filter(t->t.getBugFound()>5)
                .forEach(Tester::describe);
        System.out.println("*******************");
        testers.stream()
                .filter(t->t.getBugFound()==0)
                .forEach(Tester::describe);
        System.out.println("*******************");
        testers.stream()
                .filter(t->t.getName().startsWith("R"))
                .forEach(Tester::describe);


        System.out.println("*******************");
        testers.stream()
                .map(t->t.getName())
                .forEach(name -> System.out.println(name));
        System.out.println("*******************");
        testers.stream()
                .map(Tester::getName)
                .forEach(System.out::println);


        System.out.println("*******************");
        testers.stream()
                .filter(t->t.getBugFound()>5)
                .map(t->t.getName())
                .forEach(name -> System.out.println(name));
        System.out.println("*******************");
        testers.stream()
                .filter(t->t.getBugFound()>5)
                .map(Tester::getName)
                .forEach(System.out::println);
    }
}
