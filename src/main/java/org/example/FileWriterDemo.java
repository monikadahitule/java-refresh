package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriterDemo{
    public static void main(String[] args) {
        List<Tester> testers = new ArrayList<>(List.of(new Tester("Ravi",10),new Tester("Kumar",11),
                new Tester("Panduranga",1),new Tester("Ravi",0)));
        //testers.forEach(t->t.describe());
        try (FileWriter writer = new FileWriter("testers.txt",true)){
            for (Tester t : testers){
                writer.write(t.getName() + " " + t.getBugFound() + "\n");
            }
        } catch(IOException e){
            System.out.println("Could not write file " + e.getMessage());
        }

    }
}
