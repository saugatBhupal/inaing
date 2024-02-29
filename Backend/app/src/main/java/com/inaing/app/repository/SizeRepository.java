package com.inaing.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inaing.app.entity.Size;

@Repository
public interface SizeRepository extends JpaRepository<Size,Long>{

}
