package com.mitocode.java10.collections;

import com.mitocode.model.Product;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionApp {

    private void m1CopyOf(List<Product> list){
        List<Product> copyList = List.copyOf(list); // creates an immutable copy
        //copyList.add(new Product(4, "PS6", false)); //this would throw an UnsupportedOperationException
        copyList.forEach(System.out::println);

        Set<Product> copySet = Set.copyOf(list); // creates an immutable copy
        copySet.forEach(System.out::println);

        Map<Integer, Product> map = new HashMap<>();
        map.put(1, new Product(1, "PS4", true));
        map.put(2, new Product(2, "PS5", true));

        Map<Integer, Product> mapCopy = Map.copyOf(map);
        //mapCopy.put(3, new Product(3, "PS6", false));
        System.out.println(mapCopy);
    }

    private void m2Unmodifiable(List<Product> list) {
        List<Product> unmodifiableList = Collections.unmodifiableList(list);
        List<Product> copyOfList = List.copyOf(list);

        //unmodifiableList.add(new Product(4, "PS6", true));
        //modifico el origen
        list.add(new Product(4, "PS6", true));

        //System.out.println("unmodifiableList: " + unmodifiableList);
        //System.out.println("copyOfList: " + copyOfList);

        List<Product> unmodifiableProductList = list.stream()
                                        .collect(Collectors.toUnmodifiableList());

        System.out.println(unmodifiableProductList);

    }

        public static void main(String[] args) {
        CollectionApp app = new CollectionApp();

        List<Product> list = new ArrayList<>();
        list.add(new Product(1, "PS3", true));
        list.add(new Product(2, "PS4", true));
        list.add(new Product(3, "PS5", true));

        app.m2Unmodifiable(list);
    }
}
