package org.example.week3;

import java.util.*;

public class ProductStreamPractice {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Backpack",29.99,"Bags"));
        products.add(new Product("Bike Light",9.99,"Outdoor"));
        products.add(new Product("T-Shirt",15.99,"Clothes"));
        products.add(new Product("Jacket",49.99,"Clothes"));
        products.add(new Product("Onesie",7.99,"Clothes"));
        products.add(new Product("Laptop Bag",39.99,"Bags"));
        //System.out.println(products);
        System.out.println("Print the names of products with a price over 20");
        products.stream().filter(p->p.getPrice()>20).map(Product::getName).forEach(System.out::println);
        System.out.println("Print all products sorted by price, lowest first");
        products.stream().sorted(Comparator.comparingDouble(Product::getPrice)).forEach(System.out::println);
        System.out.println("Make a List<String> of all the names, and print it.");
        List<String> productNames = products.stream().map(Product::getName).toList();
        System.out.println(productNames);
        System.out.println("Find the most expensive product :");
        products.stream().max(Comparator.comparingDouble(Product::getPrice)).map(Product::getName).ifPresent(System.out::println);
        System.out.println("Calculate the total price of all products");
        double productSum = products.stream().mapToDouble(Product::getPrice).sum();
        System.out.println(String.format("%.2f",productSum));
        System.out.println("Group by category with a map");
        Map<String,List<String>> categoryToProduct = new HashMap<>();
        for(Product product : products){
            categoryToProduct.computeIfAbsent(product.getCategory(),k->new ArrayList<>()).add(product.getName());
        }
        System.out.println(categoryToProduct);

    }
}
