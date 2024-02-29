package com.inaing.app.repository;

import org.springframework.stereotype.Repository;

import com.inaing.app.entity.Images;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ImagesRepository extends JpaRepository<Images,Long>{
    
}
