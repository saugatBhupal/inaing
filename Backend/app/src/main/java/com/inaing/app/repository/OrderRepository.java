package com.inaing.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inaing.app.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{
    
}
