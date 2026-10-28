package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionConsumerDemo {
    public static void main(String[] args) {
        List<Tester> testers = new ArrayList<>();
        testers.add(new Tester("Ravi",10));
        testers.add(new Tester("Ravi",11));
        testers.add(new Tester("Panduranga",1));
        testers.add(new Tester("Kumar",0));

        //testers.forEach(t->t.describe());

        Consumer<Tester> myJob = t->t.describe();
        for (Tester t : testers){
            myJob.accept(t);
        }

        Function<Tester, String> myFun = t->t.getName();
        for (Tester t : testers){
            String returnValue = myFun.apply(t);
            System.out.println(returnValue);
        }

        int count = 0;
        Function<Tester,Integer> getBugCountFun = t-> t.getBugFound();
        for (Tester t : testers){
            count += getBugCountFun.apply(t);
        }
        System.out.println(count);

    }
}
