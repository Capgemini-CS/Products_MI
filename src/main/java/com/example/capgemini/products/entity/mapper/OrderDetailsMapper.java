package com.example.capgemini.products.entity.mapper;

import com.example.capgemini.products.entity.OrderDetails;
import com.example.capgemini.products.entity.dto.OrderDetailsDTO;
import org.dozer.DozerBeanMapper;

public class OrderDetailsMapper {

    public static OrderDetailsDTO toOrderDetailsDTO(OrderDetails orderDetails){
        OrderDetailsDTO orderDetailsDTO = new DozerBeanMapper().map(orderDetails, OrderDetailsDTO.class);
        return orderDetailsDTO;
    }

    public static OrderDetails toOrderDetails(OrderDetailsDTO orderDetailsDTO){
        OrderDetails orderDetails = new DozerBeanMapper().map(orderDetailsDTO,OrderDetails.class);
        return orderDetails;
    }
}
