package org.example;

public class FirefoxBrowser implements Browser {
    @Override
    public void open() {
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox Browser");
    }
}
