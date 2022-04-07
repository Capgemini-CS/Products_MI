package com.example.capgemini.products.entity.mapper;

import com.example.capgemini.products.entity.Product;
import com.example.capgemini.products.entity.dto.ProductDTO;
import org.dozer.DozerBeanMapper;

public class ProductMapper {

    public static ProductDTO toProductDTO(Product product){
        ProductDTO productDTO = new DozerBeanMapper().map(product,ProductDTO.class);
        return productDTO;
    }

    public static Product toProduct(ProductDTO productDTO){
        Product product = new DozerBeanMapper().map(productDTO,Product.class);
        return product;
    }
}
