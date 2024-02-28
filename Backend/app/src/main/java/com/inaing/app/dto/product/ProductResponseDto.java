package com.inaing.app.dto.product;

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
}
