package com.inaing.app.dto.product;

import java.util.List;

import org.hibernate.mapping.Set;

import com.inaing.app.entity.Color;
import com.inaing.app.entity.Size;

import io.micrometer.common.lang.NonNull;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class ProductRequestDto {

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
    private List<Long> colors;

    @NonNull
    private List<Long> sizes;
}
