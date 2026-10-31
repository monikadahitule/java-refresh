package org.example.browser;

public class Chrome implements Browser{
    public Chrome(){}
    @Override
    public void open(String url) {
        if(url==null || url.isEmpty()){
            throw new IllegalArgumentException("Url must not empty");
        }
        System.out.println("Chrome Opened url" + url);
    }

    @Override
    public String getName() {
        return "Chrome";
    }
}
