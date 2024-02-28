package com.inaing.app.mappers;

import org.mapstruct.Mapper;

import com.inaing.app.dto.product.ProductRequestDto;
import com.inaing.app.dto.product.ProductResponseDto;
import com.inaing.app.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    
    ProductResponseDto toProductResponseDto(Product product);

    Product toProduct(ProductRequestDto productRequestDto);
}
