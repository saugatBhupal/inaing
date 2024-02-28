package com.inaing.app.service;

import java.util.List;

import com.inaing.app.dto.global.GlobalResponse;
import com.inaing.app.dto.product.ProductRequestDto;
import com.inaing.app.dto.product.ProductResponseDto;

public interface ProductService {
    GlobalResponse<ProductResponseDto> save(ProductRequestDto productRequestDto);
    GlobalResponse<ProductResponseDto> getProductByID(Long productID);
    GlobalResponse<List<ProductResponseDto>> getAllProducts();
    GlobalResponse<ProductResponseDto> updateProductByID(Long Id, ProductRequestDto productRequestDto);
    GlobalResponse<String> deleteProductByID(Long id);
}
