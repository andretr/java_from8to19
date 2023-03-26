package com.mitocode.java11.array;

import com.mitocode.model.Product;

import java.util.Arrays;
import java.util.List;

public class ArrayApp {

    public static void main(String[] args) {
        List<Product> list = Arrays.asList(new Product(1, "PS4", true), new Product(2, "PS5", false));
        Product[] array = list.toArray(Product[]::new);

        array[2] = new Product(3, "PS6", false);

        for(Product p : array){
            System.out.println(p);
        }
    }
}
