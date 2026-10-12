package org.example;

public class StudentDemo {
    public static void main(String[] args){
        Student s1 = new Student("monika",40);
        System.out.println(s1.getName());
        s1.setMarks(450);
        System.out.println(s1.getMarks());

        s1.setMarks(100);      // accepted, print the marks to confirm
        s1.setMarks(-1);       // rejected
        Student s2 = new Student("ravi", 72);
        System.out.println(s2.getName() + " " + s2.getMarks());
        System.out.println(s1.getName() + " " + s1.getMarks());
        Student s3 = new Student("x",500);
        System.out.println(s3.getName() + " " + s3.getMarks());
    }
}
