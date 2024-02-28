package com.inaing.app.entity;

import java.util.HashSet;
import java.util.Set;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "color")
@AllArgsConstructor
@Data
public class Color {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NonNull
    private String color;
    
    @NonNull
    private String code;
    
    @ManyToMany(mappedBy = "colors")
    private Set<Product> products = new HashSet<>();
}
