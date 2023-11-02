package com.testing.JLambdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

}

public class FilterDemo4 {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<Product>();
        List<Product> productFilter = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop", 25000));
        productList.add(new Product(1, "Dell Laptop", 35000));
        productList.add(new Product(1, "Lenovo Laptop", 42000));
        productList.add(new Product(1, "Sony Laptop", 29000));
        productList.add(new Product(1, "Apple Laptop", 93000));

        productList.stream().filter(p->p.price>35000).forEach(pr-> System.out.println(pr.price));
        productFilter=productList.stream().filter(p->p.price>35000).collect(Collectors.toList());

        /*for(Product p : productFilter) {
          System.out.println("Id: " + p.id);
          System.out.println("Name: " + p.name);
          System.out.println("Price: " + p.price);
        }*/
        productFilter.stream().forEach(p-> {
            System.out.print(p.name);
            System.out.println(p.id);
            System.out.println(p.price);
        });
    }
    }
