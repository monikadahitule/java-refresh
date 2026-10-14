package org.example;

public class ChromeBrowser implements Browser {
    @Override
    public void open() {
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Chrome Browser");
    }


}

