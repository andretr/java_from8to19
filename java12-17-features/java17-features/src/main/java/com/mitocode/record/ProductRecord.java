package com.mitocode.record;

import java.io.Serializable;

public record ProductRecord(
        int id,
        String name,
        double price,
        boolean status
)
        implements Fabric{

    public static int AGE = 32;

    public ProductRecord(String name){
        this(1, name, 99.99, true);
    }

    public ProductRecord(String name, double price){
        this(1, name, price, true);
    }

    /*public void setName(String name){
        this.name = name;
    }*/

    public String getUpperName(){
        return name.toUpperCase();
    }

    public void test(){
        System.out.println("test");
    }


    @Override
    public void testFabric() {
        System.out.println("Test fabric");
    }
}
