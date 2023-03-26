package com.mitocode.record;

import java.util.Objects;

public class Product {

    private final int id;
    private final String name;
    private final double price;
    private final boolean status;

    public Product(int id, String name, double price, boolean status) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(product.price, price) == 0 && status == product.status && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, status);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                '}';
    }
}
