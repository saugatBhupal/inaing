package com.inaing.app.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.inaing.app.dto.product.ProductRequestDto;
import com.inaing.app.dto.product.ProductResponseDto;
import com.inaing.app.entity.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    
    ProductResponseDto toProductResponseDto(Product product);

    @Mapping(target = "colors", ignore = true)
    @Mapping(target = "sizes", ignore = true)
    Product toProduct(ProductRequestDto productRequestDto);
}
