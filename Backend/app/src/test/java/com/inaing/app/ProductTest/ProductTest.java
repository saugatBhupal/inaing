package com.inaing.app.ProductTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.inaing.app.entity.Color;
import com.inaing.app.entity.Images;
import com.inaing.app.entity.Product;
import com.inaing.app.entity.Size;
import com.inaing.app.repository.ProductRepository;

import jakarta.transaction.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@DataJpaTest
public class ProductTest {

    @Autowired
    private ProductRepository productRepository;

    @Transactional
    @Test
    public void saveProductTest() {
        Product product = new Product();
        product.setName("Sample Product");
        product.setDescriptiveName("Sample Descriptive Name");
        product.setDescription("Sample Description");
        product.setPrice(100.0);
        product.setMaterial("Sample Material");
        product.setGender("Sample Gender");

        Set<Color> colors = new HashSet<>();
        Set<Size> sizes = new HashSet<>();
        product.setColors(colors);
        product.setSizes(sizes);
        productRepository.save(product);
        Assertions.assertNotNull(product.getId());
    }

    @Test
    public void retrieveProductTest() {
        Long productId = 1L;
        Product retrievedProduct = productRepository.findById(productId).orElse(null);
        Assertions.assertNotNull(retrievedProduct);
        Assertions.assertEquals("Sample Product", retrievedProduct.getName());
    }

    @Transactional
    @Test
    public void updateProductTest() {
        Long productId = 1L;

        Product existingProduct = productRepository.findById(productId).orElse(null);
        Assertions.assertNotNull(existingProduct);
        existingProduct.setName("Updated Product Name");
        productRepository.save(existingProduct);
        Product updatedProduct = productRepository.findById(productId).orElse(null);

        Assertions.assertNotNull(updatedProduct);
        Assertions.assertEquals("Updated Product Name", updatedProduct.getName());
    }

    @Test
    public void deleteProductTest() {
        Long productId = 1L;
        productRepository.deleteById(productId);
        Product deletedProduct = productRepository.findById(productId).orElse(null);
        Assertions.assertNull(deletedProduct);
    }
}
