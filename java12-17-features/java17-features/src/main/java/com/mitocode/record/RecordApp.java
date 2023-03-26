package com.mitocode.record;

public class RecordApp {

    public static void main(String[] args) {
        Product p = new Product(1, "TV", 999.99, true);
        System.out.println(p);

        ProductRecord pr = new ProductRecord(1, "TV", 999.99, true);
        System.out.println(pr.name());

        ProductRecord pr2 = new ProductRecord("psp");
        System.out.println(pr2.getUpperName());
        pr2.test();
        pr2.testFabric();

        System.out.println(ProductRecord.AGE);
    }
}
