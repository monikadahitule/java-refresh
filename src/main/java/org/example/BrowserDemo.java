package org.example;

public class BrowserDemo {
    public static void main(String[] args) {

        Browser b = new ChromeBrowser();
        b.open();
        b.close();

        b = new FirefoxBrowser();
        b.open();
        b.close();
    }
}
