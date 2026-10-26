package org.example;

public class Person {
    private String name ;

    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void describe() {
        System.out.println("I am " +getName() );
    }
}
