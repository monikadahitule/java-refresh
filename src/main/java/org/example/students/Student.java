package org.example.students;

public class Student {
    private String name;
    private int marks;
    public Student(String name,int marks){
        if(marks < 0 || marks > 100){
            throw new IllegalArgumentException("Marks must be bet 0 and 100 for student name :" + name);
        }
        this.name = name;
        this.marks = marks;
    }
    public int getMarks(){
        return this.marks;
    }
    public String getName(){
        return this.name;
    }
    public void display(){
        System.out.println("Name:"+this.name+" Marks: "+this.marks);
    }
}
