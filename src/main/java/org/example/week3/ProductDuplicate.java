package org.example.week3;

import java.util.HashSet;
import java.util.Set;

public class ProductDuplicate {
    public static void main(String[] args) {
        Product p1 = new Product("Backpack", 29.99, "Bags");
        Product p2 = new Product("Backpack", 29.99, "Bags");

        Set<Product> uniqueProducts = new HashSet<>();
        uniqueProducts.add(p1);
        uniqueProducts.add(p2);

        System.out.println(uniqueProducts);
        System.out.println(uniqueProducts.size());
        System.out.println(p1.equals(p2));
        System.out.println(p1==p2);


    }
}
