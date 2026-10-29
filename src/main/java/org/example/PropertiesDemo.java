package org.example;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        try (FileReader reader = new FileReader("config.properties")) {
            props.load(reader);   //this line just read all properties from reader to props object

        } catch (IOException e) {
            System.out.println("Could not read file " + e.getMessage());
        }

        System.out.println(props.getProperty("browser"));
        System.out.println(props.getProperty("url"));
        System.out.println(props.getProperty("timeout"));

        int moretime = Integer.parseInt(props.getProperty("timeout", "0")) + 5;
        System.out.println("More time " + moretime);

        System.out.println(props.getProperty("retries", "3"));

        props.setProperty("browser", "edge");
        try (FileWriter writer = new FileWriter("config.properties")) {
            props.store(writer, "updated settings");
        } catch (Exception e) {
            System.out.println("Could not write to file " + e.getMessage());
        }


    }


}
