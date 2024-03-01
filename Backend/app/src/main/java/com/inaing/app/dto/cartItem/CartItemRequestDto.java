package com.inaing.app.dto.cartItem;

import com.inaing.app.entity.Color;
import com.inaing.app.entity.Product;
import com.inaing.app.entity.Size;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class CartItemRequestDto {
    
    private Integer quantity;

    private Double cost;

    private Long colorID;

    private Long sizeID;

    private Long productID;
}
