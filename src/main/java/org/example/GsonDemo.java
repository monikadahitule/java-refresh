package org.example;

import com.google.gson.Gson;

public class GsonDemo {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson(new Tester("Ravi",10));
        System.out.println(json);

        String jsonText = "{\"bugFound\":-21,\"name\":\"Vimo\"}"; //Negative on purpose :Gson skips the constructor check
        Tester t = gson.fromJson(jsonText, Tester.class);
        if (t.getBugFound() < 0 ){
            System.out.println("Invalid data : bugFoud must not be negative");
        } else {
            t.describe();
        }
    }
}
