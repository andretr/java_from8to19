package com.mitocode.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString(onlyExplicitlyIncluded = true)
public class Product {

    @EqualsAndHashCode.Include
    @ToString.Include
    private int id;
    private String name;
    private boolean status;
}
