package com.example.capgemini.products.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDetailsDTO {
    private Integer id_order;
    private Integer id_product;
    private Integer quantity_ordered;
    private Integer price;
}
