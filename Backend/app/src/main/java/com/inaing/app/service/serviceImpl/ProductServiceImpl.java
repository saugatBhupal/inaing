package com.inaing.app.service.serviceImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.inaing.app.dto.global.GlobalResponse;
import com.inaing.app.dto.product.ProductRequestDto;
import com.inaing.app.dto.product.ProductResponseDto;
import com.inaing.app.entity.Color;
import com.inaing.app.entity.Images;
import com.inaing.app.entity.Product;
import com.inaing.app.entity.Size;
import com.inaing.app.exception.GlobalException;
import com.inaing.app.mappers.ProductMapper;
import com.inaing.app.repository.ProductRepository;
import com.inaing.app.service.ColorService;
import com.inaing.app.service.ImageService;
import com.inaing.app.service.ProductService;
import com.inaing.app.service.SizeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    private final ColorService colorService;
    private final SizeService sizeService;
    private final ImageService imageService;
    
    @Override
    public GlobalResponse<ProductResponseDto> save(ProductRequestDto productRequestDto, List<MultipartFile> images) {
        try{
            Product product = productRepository.save(productMapper.toProduct(productRequestDto));
            Set<Color> colors = new HashSet<>();
            for(Long colorID : productRequestDto.getColors()){
                colors.add(colorService.getColor(colorID));
            }
            Set<Size> sizes = new HashSet<>();
            for(Long sizeID : productRequestDto.getSizes()){
                sizes.add(sizeService.getSize(sizeID));
            }
            for(MultipartFile image : images){
                imageService.save(image,product);
            }
            product.setColors(colors);
            product.setSizes(sizes);
            Product savedProduct = productRepository.save(product);
            return new GlobalResponse<ProductResponseDto>(HttpStatus.SC_OK, productMapper.toProductResponseDto(savedProduct));
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
