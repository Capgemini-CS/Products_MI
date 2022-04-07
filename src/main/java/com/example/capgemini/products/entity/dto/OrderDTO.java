package com.example.capgemini.products.entity.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderDTO {
    private Integer id_order;
    private String sender_name;
    private String customer_name;
    private String status;
}
