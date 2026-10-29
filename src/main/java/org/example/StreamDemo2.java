package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        List<Tester> testers = new ArrayList<>();
        testers.add(new Tester("Ravi", 10));
        testers.add(new Tester("Ravi", 11));
        testers.add(new Tester("Panduranga", 1));
        testers.add(new Tester("Kumar", 0));

        //list names of testers
        List<String> names = testers.stream().map(Tester::getName).collect(Collectors.toList());
        System.out.println(names);

        //list testers names with more than 5 bugs
        List<String> testersWithMoreBugs = testers.stream().filter(t->t.getBugFound()>5).map(Tester::getName).collect(Collectors.toList());
        System.out.println(testersWithMoreBugs);

        //count testers with more than 5 bugs
        long manyBugsCount = testers.stream().filter(t->t.getBugFound()>5).count();
        System.out.println(manyBugsCount);

        //Total bugs
        int total = testers.stream().mapToInt(Tester::getBugFound).sum();
        System.out.println(total);

        //get unique testers name
        Set<String> uniqueTesters = testers.stream().map(Tester::getName).collect(Collectors.toSet());
        System.out.println(uniqueTesters);

        //sort by bugs highest first
        testers.stream().sorted(Comparator.comparingInt(Tester::getBugFound).reversed()).forEach(Tester::describe);

        System.out.println("**************************");
        //print names sort by names
        testers.stream().map(Tester::getName).sorted().forEach(System.out::println);
        System.out.println("**************************");
        //another version for same output
        testers.stream().sorted(Comparator.comparing(Tester::getName)).map(Tester::getName).forEach(System.out::println);

        System.out.println("-----");
        //check if original order isnt changed
        testers.forEach(Tester::describe);
    }


}
