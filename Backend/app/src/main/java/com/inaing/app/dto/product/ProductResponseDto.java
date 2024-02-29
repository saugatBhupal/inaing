package com.inaing.app.dto.product;

import java.util.List;
import java.util.Set;

import com.inaing.app.entity.Color;
import com.inaing.app.entity.Images;
import com.inaing.app.entity.Size;

import io.micrometer.common.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductResponseDto {

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

    @NonNull
    private Set<Color> colors;

    @NonNull
    private Set<Size> sizes;

    @NonNull
    private Set<Images> images; 
}
