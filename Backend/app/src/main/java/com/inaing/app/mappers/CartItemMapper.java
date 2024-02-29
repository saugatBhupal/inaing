package com.inaing.app.mappers;

import org.mapstruct.Mapper;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.CartItem;

@Mapper(componentModel = "spring")
public interface CartItemMapper {
    
    CartItem toCartItem(CartItemRequestDto cartItemRequestDto);
}
