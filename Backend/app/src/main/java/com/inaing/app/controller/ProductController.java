package com.inaing.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inaing.app.dto.global.GlobalResponse;
import com.inaing.app.dto.product.ProductRequestDto;
import com.inaing.app.dto.product.ProductResponseDto;
import com.inaing.app.service.ProductService;

import lombok.AllArgsConstructor;

import java.util.List;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@AllArgsConstructor
@RequestMapping("/api/product")
public class ProductController {
    private final ProductService productService;

    @PostMapping("")
    public ResponseEntity<GlobalResponse<ProductResponseDto>> saveProductHandler(@RequestParam("images") List<MultipartFile> images ,@RequestPart("product") ProductRequestDto productRequestDto) {
        GlobalResponse<ProductResponseDto> response = productService.save(productRequestDto, images);
        return ResponseEntity.status(HttpStatus.SC_OK).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GlobalResponse<ProductResponseDto>> getProductHandler(@PathVariable("id") Long productID) {
        GlobalResponse<ProductResponseDto> response = productService.getProductByID(productID);
        return ResponseEntity.status(HttpStatus.SC_OK).body(response);
    }

    @GetMapping("")
    public ResponseEntity<GlobalResponse<List<ProductResponseDto>>> getAllProductsHandler(){
        GlobalResponse<List<ProductResponseDto>> response = productService.getAllProducts();
        return ResponseEntity.status(HttpStatus.SC_OK).body(response);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<GlobalResponse<String>> deleteProductHandler(@PathVariable("id") Long productID){
        GlobalResponse<String> response = productService.deleteProductByID(productID);
        return ResponseEntity.status(HttpStatus.SC_OK).body(response);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GlobalResponse<ProductResponseDto>> updateProductHandler(@PathVariable Long productID, @RequestBody ProductRequestDto productRequestDto) {
        GlobalResponse<ProductResponseDto> response = productService.updateProductByID(productID, productRequestDto);
        return ResponseEntity.status(HttpStatus.SC_OK).body(response);
    }
}
