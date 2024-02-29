package com.inaing.app.service;

import java.util.List;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.Order;

public interface OrderService {
    Order save(List<CartItemRequestDto> items);
    Order findById(Long id);
}
