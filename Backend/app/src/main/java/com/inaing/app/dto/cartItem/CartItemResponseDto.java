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
public class CartItemResponseDto {

    private Long id;

    private Integer quantity;

    private Double cost;

    private Color color;

    private Size size;

    private Product product;
}
