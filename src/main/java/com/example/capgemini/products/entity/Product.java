package com.example.capgemini.products.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private Integer id_product;
    private String name;
    private String vendor;
}
