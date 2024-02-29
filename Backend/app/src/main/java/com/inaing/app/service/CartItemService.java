package com.inaing.app.service;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.CartItem;

public interface CartItemService {
    CartItem save(CartItemRequestDto cartItemRequestDto, Long orderID);
}
