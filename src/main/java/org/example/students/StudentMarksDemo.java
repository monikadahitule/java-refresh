package org.example.students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentMarksDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ram", 100));
        students.add(new Student("Ravi", 10));
        try {
            students.add(new Student("Anay", -10));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        students.add(new Student("Anagha", 51));
        students.add(new Student("Sai", 0));
        students.add(new Student("Eliza", 1));
        students.add(new Student("Ana", 40));

        students.forEach(Student::display);
        int totalMarks = students.stream().mapToInt(Student::getMarks).sum();
        System.out.println("Total marks of all students : "+ totalMarks);
        long totalStudents = students.size(); //students.stream().count();
        System.out.println("Total number of students:"+totalStudents);
        double calculatedAve = (double) totalMarks/totalStudents;
        System.out.println("Calculated average: " + calculatedAve);
        System.out.println("Average of all students : "+ students.stream().mapToDouble(s->s.getMarks()).average().orElse(0));


        //student with highest marks
        Optional<Student> firstRank = students.stream().max(Comparator.comparingInt(Student::getMarks));
        firstRank.ifPresent(s->System.out.println("Student with highest rank: " + s.getName()));

        //pass list
        List<Student> passedStudents = students.stream().filter(s->s.getMarks()>=40).sorted(Comparator.comparingInt(Student::getMarks).reversed()).toList();
        passedStudents.forEach(Student::display);

    }
}
