package com.inaing.app.entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String descriptiveName;
    
    @NonNull
    private String description;

    @NonNull
    private Double price; 

    @NonNull
    private String material;

    @NonNull
    private String gender;

    // @NonNull
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "Product_Color",
        joinColumns = { @JoinColumn(name = "productID")},
        inverseJoinColumns = { @JoinColumn(name = "colorID")}
    )
    private Set<Color> colors;

    // @NonNull
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
        name = "Product_Size",
        joinColumns =  { @JoinColumn(name = "productID")},
        inverseJoinColumns = { @JoinColumn(name = "sizeID")}
    )
    private Set<Size> sizes;

    // @NonNull
    @OneToMany(orphanRemoval = true ,cascade = {CascadeType.ALL}, mappedBy = "product")
    @JsonManagedReference(value = "product-image")
    private List<Images> images;
}
