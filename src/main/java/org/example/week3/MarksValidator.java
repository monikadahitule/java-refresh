package org.example.week3;

public class MarksValidator {

    public static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100, but got " + marks);
        }
    }

    public static void main(String[] args) {
        int[] marksList = {85, -21, 40, 101};

        for (int marks : marksList) {
            try {
                validateMarks(marks);
                System.out.println("Valid " + marks);
            } catch (InvalidMarksException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
