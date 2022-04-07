package com.example.capgemini.products.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {
    private Integer id_order;
    private String sender_name;
    private String customer_name;
    private String status;
}
