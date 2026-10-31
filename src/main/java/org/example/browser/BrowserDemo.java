package org.example.browser;

import java.util.ArrayList;
import java.util.List;

public class BrowserDemo {
    public static void main(String[] args) {
        List<Browser> browsers = new ArrayList<>(List.of(new Chrome(),new Edge()));
        for(Browser b : browsers){
            b.open("https://example.com");
            System.out.println(b.getName());
        }
        try {
            browsers.get(0).open("");
        } catch (IllegalArgumentException e) {
            System.out.println("cant open url " + e.getMessage());
        }


    }
}
