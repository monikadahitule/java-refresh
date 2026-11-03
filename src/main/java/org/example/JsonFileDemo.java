package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class JsonFileDemo {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        List<Tester> testers = List.of(new Tester("Ravi", 10), new Tester("Kumar", 11));

        try (FileWriter writer = new FileWriter("testers.json")) {
            gson.toJson(testers, writer);
        } catch (IOException e) {
            System.out.println("Could not write to file " + e.getMessage());
        }

        //Reading json file
        try(FileReader reader = new FileReader("testers1.json")){
            Type listType = new TypeToken<List<Tester>>() {}.getType();
            List<Tester> loaded = gson.fromJson(reader,listType);
            loaded.forEach(Tester::describe);
            //testers name bugFound < 0
            long numNoBugFoundTesters = loaded.stream().filter(t->t.getBugFound()<0).count();
            System.out.println("Number of testers with BugFound is < 0" + numNoBugFoundTesters);
        } catch (IOException e) {
            System.out.println("Could not read the file " + e.getMessage());
        }




    }

}
