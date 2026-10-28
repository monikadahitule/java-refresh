package org.example;

import java.util.ArrayList;
import java.util.Comparator;

public class LambdaSort {
    public static void main(String[] args) {
        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(new Tester("Ravi",10));
        testers.add(new Tester("Ravi",11));
        testers.add(new Tester("Panduranga",1));
        testers.add(new Tester("Kumar",0));

        //sort by bugs highest first using lambda
        /*testers.sort((a,b) -> {
            System.out.println("comparing "+b.getName()+" bugFound " +b.getBugFound() + " with "+a.getName()+" bugFound "+a.getBugFound());
            return Integer.compare(b.getBugFound(),a.getBugFound());}); */
        testers.sort((a,b) -> Integer.compare(b.getBugFound(),a.getBugFound()));
        testers.forEach(t -> t.describe());


        //sort by name
        testers.sort((a,b)-> a.getName().compareTo(b.getName()));
        System.out.println("******************");
        testers.forEach(t -> t.describe());

        testers.sort(Comparator.comparing(t -> t.getName()));
        System.out.println("******************");
        testers.forEach(t -> t.describe());

        testers.sort(Comparator.comparing(Tester::getName));
        System.out.println("******************");
        testers.forEach(t -> t.describe());


    }
}
