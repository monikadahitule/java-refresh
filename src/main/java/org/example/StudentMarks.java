package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentMarks {
    static HashMap<String, Integer> students = new HashMap<>();
    static void addStudent(String name, int mark){
        if(mark>=0 && mark<=100){
            students.put(name,mark);
        } else {
            throw new IllegalArgumentException("Invalid marks " + mark + "for student " + name);
        }
    }
    static double average(){
        if (students.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (int mark : students.values()){
            sum += mark;
        }
        return sum/students.size();
    }

    static void topScorer(){
        if(students.isEmpty()){
            System.out.println("No students");
            return;
        }
        int topScore = -1;
        ArrayList<String> topNames = new ArrayList<>();
        for(Map.Entry<String, Integer> entry:students.entrySet()){
            int mark = entry.getValue();
            if (topScore < mark){
                topScore = mark;
                topNames.clear();
                topNames.add(entry.getKey());
            } else if(topScore == mark){
                topNames.add(entry.getKey());
            }
        }
            System.out.println(topNames + "have top score " + topScore);


    }

    public static void main(String[] args){
        String[] names = {"ravi","asha","meena"};{};//{"tom"};//{"asha", "ravi", "meena", "tom", "priya", "x"};
        int[] marks = {90,90,10};//{};//{-1};//{85, 150, 91, 0, 100, -1};

        for(int i=0;i<names.length;i++) {
            try {
                addStudent(names[i], marks[i]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        topScorer();
        System.out.println(average());
    }
}
