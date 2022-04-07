package com.example.capgemini.products.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDTO {
    private Integer id_product;
    private String name;
    private String vendor;
}
