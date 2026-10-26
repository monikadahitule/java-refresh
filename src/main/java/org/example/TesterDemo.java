package org.example;

public class TesterDemo {
    public static void main(String[] args){
        Tester t1 = new Tester("Asha",5);
        t1.describe();
        Tester t2 = new Tester("Meena",0);
        t2.describe();
        try {
            Tester t3 = new Tester("Ravi", -3);
            t3.describe();
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        Person p = new Tester("Neha", 7);
        p.describe();
    }
}
