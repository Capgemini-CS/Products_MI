package com.example.capgemini.products.entity.mapper;

import com.example.capgemini.products.entity.Order;
import com.example.capgemini.products.entity.dto.OrderDTO;
import org.dozer.DozerBeanMapper;

public class OrderMapper {

    public static OrderDTO toOrderDTO(Order order){
        OrderDTO orderDTO = new DozerBeanMapper().map(order,OrderDTO.class);
        return orderDTO;
    }

    public static Order toOrder(OrderDTO orderDTO){
        Order order = new DozerBeanMapper().map(orderDTO,Order.class);
        return order;
    }
}
