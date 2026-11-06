package org.example.report;

import org.example.students.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Properties;

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
                    System.out.println("Marks are not in number in line: " + line + "(" + e.getMessage() + ")");
                }catch (IllegalArgumentException e){
                    System.out.println("Illegal Argument provided : " + e.getMessage());
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found " + e.getMessage());
        }catch (IOException e){
            System.out.println("Can not read file :" + fileName + " " + e.getMessage());
        }
        return students;
    }

    private static int loadPassMark(){
        int passMarkValue = 40;
        Properties props = new Properties();
        try(FileReader reader = new FileReader("config.properties")){
            props.load(reader);
            passMarkValue = Integer.parseInt(props.getProperty("passMark","40").trim());
            System.out.println("Pass Key value in config.properties file :" + passMarkValue);
        }catch (IOException e){
            System.out.println("Could not read config.properties :(" +e.getMessage() + "), using default value 40");
        }catch (NumberFormatException e){
            System.out.println("PassMark is not a number: (" + e.getMessage()+") using default value 40"  );
        }

        return passMarkValue;

    }


    private static List<String> buildReport(List<Student> students,int passMark){
        List<String> lines = new ArrayList<>();
        int studentSize = students.size();
        lines.add("Total Students : " + studentSize);
        int totalMarks = students.stream().mapToInt(Student::getMarks).sum();
        lines.add("Total Marks : " + totalMarks);
        double average = students.stream().mapToInt(Student::getMarks).average().orElse(0);
        lines.add("Average Marks : " + String.format("%.2f", average));
        //highest mark and name
        students.stream().max(Comparator.comparingInt(Student::getMarks)).ifPresent(s->lines.add("Highest Marks:"+s.getName()+"("+s.getMarks()+")"));

        //passed students in descending order
        lines.add("Passed students (" + passMark + " or more) :");
        List<Student> passed = students.stream().filter(s->s.getMarks() >= passMark).sorted(Comparator.comparingInt(Student::getMarks).reversed())
                .toList();
        if(passed.isEmpty()){
            lines.add(" None");
        }else {
            passed.forEach(s->lines.add(" " +s.getName() + "(" + s.getMarks() + ")"));
        }

        //failed count--> student below passMark
        lines.add("Failed count (less than " + passMark+ "): "+ students.stream().filter(s->s.getMarks()< passMark).count());


        return lines;

    }

    public static void main(String[] args) {
    List<Student> goodStudents = loadStudents("students.csv");
    goodStudents.forEach(Student::display);
    System.out.println("Good students count :" + goodStudents.size());
    int passMark = loadPassMark();
    System.out.println("Pass mark used: " + passMark);
    System.out.println("*****************************");
    List<String> lines = buildReport(goodStudents,passMark);
    lines.forEach(System.out::println);

    System.out.println("*****************************");
    buildReport(new ArrayList<>(), 40).forEach(System.out::println);
    }
}
