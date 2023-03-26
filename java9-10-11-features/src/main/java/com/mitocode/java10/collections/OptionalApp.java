package com.mitocode.java10.collections;

import java.util.Optional;

public class OptionalApp {

    public static void main(String[] args) {
        Optional<Integer> op = Optional.empty();
        op.orElseThrow(ArithmeticException::new);
    }
}
