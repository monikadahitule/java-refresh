package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileReadDemo {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("testers.txt"))){
            String line;
            int count=0;
            while ((line = reader.readLine()) !=null ){
                System.out.println(line);
                count++;
            }
            System.out.println("It has " + count + " lines");
        } catch (IOException e) {
            System.out.println("Could not read file" + e.getMessage());
        }

        try {
            List<String> lines = Files.readAllLines(Path.of("testers.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Could not read file " + e.getMessage());
        }

    }
}
