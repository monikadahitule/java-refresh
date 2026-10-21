package org.example;

public class CustomException {
    static void checkMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            System.out.println("Marks are valid");
        } else {
            throw new IllegalArgumentException("Marks must be between 0 to 100");
        }
    }

    public static void main(String[] args) {
        int[] marks = {50, 150, -1, 0, 100};
        for (int num : marks) {
            try {
                checkMarks(num);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
