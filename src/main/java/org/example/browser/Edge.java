package org.example.browser;

public class Edge implements Browser{
    public Edge(){}
    @Override
    public void open(String url) {
        if(url==null || url.isEmpty()){
            throw new IllegalArgumentException("Url must not empty");
        }
        System.out.println("Edge Opened url" + url);

    }

    @Override
    public String getName() {
        return "Edge";
    }
}
