package com.inaing.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inaing.app.entity.Color;

@Repository
public interface ColorRepository extends JpaRepository<Color,Long>{
    
}
