package com.mitocode.java11.predicate;

import com.mitocode.model.Product;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateApp {

    private void m1(){
        Predicate<Product> isNameEmpty = x -> x.getName().isEmpty();

        Predicate<Product> isNotNameEmpty = Predicate.not(isNameEmpty);

        //System.out.println(isNotNameEmpty.test(new Product(1, "", true)));

        Stream.of(new Product(1, "TV", true))
                .filter(Predicate.not(e-> e.getName().isEmpty()))
                .forEach(System.out::println);

    }

    public static void main(String[] args) {
        PredicateApp app = new PredicateApp();
        app.m1();
    }
}
