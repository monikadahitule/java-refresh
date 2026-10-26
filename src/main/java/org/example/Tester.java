package org.example;

public class Tester extends Person {
    private int bugFound;

    public Tester(String name, int bugFound) {
        super(name);
        if (bugFound < 0) {
            throw new IllegalArgumentException("Number of bugs can not be negative");
        } else {
            this.bugFound = bugFound;
        }
    }

    public int getBugFound() {
        return this.bugFound;
    }
    @Override
    public void describe() {
        System.out.println(getName() + " found " + getBugFound() + " bug(s)");
    }

}

