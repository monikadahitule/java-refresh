package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReadDemo {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader( new FileReader("testers.csv"))){
            reader.readLine();
            String line;
            List<Tester> testers = new ArrayList<>();
            while ((line = reader.readLine())!=null){
                String[] parts = line.split(",");
                if(parts.length <2){
                    System.out.println("Skipping bad line " + line);
                    continue;
                }
                try {
                    String name = parts[0].trim();
                    int bug = Integer.parseInt(parts[1].trim());
                    testers.add(new Tester(name, bug));
                }catch (NumberFormatException e){
                    System.out.println("Bug is not number for line: " + line + " ("+ e.getMessage()+ ")");
                }catch (IllegalArgumentException e){
                    System.out.println("Invalid data in line: " + line + "(" + e.getMessage() + ")");
                }
            }
            testers.forEach(Tester::describe);
            System.out.println(testers.size() + " good testers");
            System.out.println(testers.stream().mapToInt(Tester::getBugFound).sum());


        }catch (FileNotFoundException e){
            System.out.println("File not found testers.csv check file name or folder name");
        } catch (IOException e){
            System.out.println("Could not read file " + e.getMessage());
        }

    }
}
