package org.example;

public class Student {
    //Encapsulation

    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks);
    }

    public String getName() {
        return this.name;
    }

    public int getMarks() {
        return this.marks;
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100){
            this.marks = marks;
        }else{
            System.out.println("Invalid student marks");
        }
    }


}
/*
Put each class in its own file, inside org.example. For programs with several classes, make one extra class with a main method to try them out.

1. Student class (encapsulation). Create a Student class with private fields name and marks, a constructor, getters, and setters. Make setMarks reject values below 0 or above 100. In a separate StudentDemo class, create two students, print them, and try to set marks to 150.

Hint: in the rejected case, print a message and keep the old value.
* */