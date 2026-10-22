package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) { //throws FileNotFoundException{
        try {
            FileReader reader = new FileReader("missing.txt");
        } catch (FileNotFoundException e){
            System.out.println("File not Found " + e.getMessage());
        }
    }
}
