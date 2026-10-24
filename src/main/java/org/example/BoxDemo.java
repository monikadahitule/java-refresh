package org.example;

public class BoxDemo {
    public static void main(String[] args) {


        Box<String> text = new Box<>("Hello");
        System.out.println(text.getItem());

        Box<Integer> num = new Box<>(42);
        System.out.println(num.getItem());
    }
}
