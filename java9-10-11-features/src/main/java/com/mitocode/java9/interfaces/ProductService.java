package com.mitocode.java9.interfaces;

import com.mitocode.model.Product;

public interface ProductService {

    Product saveNormal();

    private void savePrivate(Product product){
        System.out.println("Saving... " + product);
    }

    private void savePrivate2(){
        this.savePrivate(new Product());
    }

    private static void saveStatic(Product product){
        System.out.println("Saving static..." + product);
    }
}
