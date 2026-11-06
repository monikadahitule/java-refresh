package org.example.report;

import org.example.students.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReportApp {
    private static List<Student> loadStudents(String fileName){
        List<Student> students = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            reader.readLine(); //reading header
            String line;
            while ((line = reader.readLine()) != null){
                String[] parts = line.split(",");
                if(parts.length < 2){
                    System.out.println("Bad data for line :" + line);
                    continue;
                }
                try {
                    String studentName = parts[0].trim();
                    int marks = Integer.parseInt(parts[1].trim());
                    students.add(new Student(studentName,marks));
                }catch (NumberFormatException e){
                    System.out.println("Marks are not in numbers in line " + line);
                    System.out.println("Invalid student in line: " + line + "(" + e.getMessage() + ")");
                }catch (IllegalArgumentException e){
                    System.out.println("Illegal Argument provided : " + e.getMessage());
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        }catch (IOException e){
            System.out.println("Can not read file :" + fileName + " " + e.getMessage());
        }
        return students; //how to return it null if data isnt present in file? or empty list ?
    }
    public static void main(String[] args) {
    List<Student> goodStudents = loadStudents("students.csv");
    goodStudents.forEach(Student::display);
    System.out.println("Good students count :" + goodStudents.size());

    }
}
