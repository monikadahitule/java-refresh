package org.example.week3;

public class Product{
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public String getCategory(){
        return this.category;
    }

    @Override
    public String toString(){
        return this.name + "(" + this.price + "," + this.category + ")";
    }
}
