package com.inaing.app.service;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.CartItem;
import com.inaing.app.entity.Order;

public interface CartItemService {
    CartItem save(CartItemRequestDto cartItemRequestDto, Order order);
}
