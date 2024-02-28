package com.inaing.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inaing.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
