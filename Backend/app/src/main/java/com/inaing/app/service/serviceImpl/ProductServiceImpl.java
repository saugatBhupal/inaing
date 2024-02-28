package com.inaing.app.service.serviceImpl;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.inaing.app.dto.global.GlobalResponse;
import com.inaing.app.dto.product.ProductRequestDto;
import com.inaing.app.dto.product.ProductResponseDto;
import com.inaing.app.entity.Product;
import com.inaing.app.exception.GlobalException;
import com.inaing.app.mappers.ProductMapper;
import com.inaing.app.repository.ProductRepository;
import com.inaing.app.service.ProductService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    
    @Override
    public GlobalResponse<ProductResponseDto> save(ProductRequestDto productRequestDto) {
        try{
            Product product = productRepository.save(productMapper.toProduct(productRequestDto));
            return new GlobalResponse<ProductResponseDto>(HttpStatus.SC_OK, productMapper.toProductResponseDto(product));
        }
        catch(Exception e){
            e.printStackTrace();
            throw new GlobalException("Internal Server Error", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public GlobalResponse<ProductResponseDto> getProductByID(Long productID) {
        try{
            Product product = productRepository.findById(productID).orElseThrow(() -> new GlobalException("Product not found", HttpStatus.SC_NOT_FOUND));
            return new GlobalResponse<ProductResponseDto>(HttpStatus.SC_OK, productMapper.toProductResponseDto(product));
        }
        catch(GlobalException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new GlobalException("Internal Server Error", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public GlobalResponse<List<ProductResponseDto>> getAllProducts() {
        try{
            List<ProductResponseDto> products = productRepository.findAll().stream()
                                                                            .map(productMapper :: toProductResponseDto)
                                                                            .toList();
            return new GlobalResponse<List<ProductResponseDto>>(HttpStatus.SC_OK, products);
        }
        catch(GlobalException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new GlobalException("Internal Server Error", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
        
    }

    @Override
    public GlobalResponse<String> deleteProductByID(Long id) {
        try{
            productRepository.deleteById(id);
            return new GlobalResponse<String>(HttpStatus.SC_OK, "Product Deleted Successfully");
        }

        catch(Exception e){
            e.printStackTrace();
            throw new GlobalException("Internal Server Error", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
    }

    @Override
    public GlobalResponse<ProductResponseDto> updateProductByID(Long Id, ProductRequestDto productRequestDto) {
        try{
            productRepository.findById(Id).orElseThrow(() -> new GlobalException("Product not found", HttpStatus.SC_NOT_FOUND));
            Product product = productMapper.toProduct(productRequestDto);
            product.setId(Id);
            Product newProduct = productRepository.save(product);
            return new GlobalResponse<ProductResponseDto>(HttpStatus.SC_OK, productMapper.toProductResponseDto(newProduct));
        }
        catch(GlobalException e){
            throw e;
        }
        catch(Exception e){
            e.printStackTrace();
            throw new GlobalException("Internal Server Error", HttpStatus.SC_INTERNAL_SERVER_ERROR);
        }
    }
    
}
