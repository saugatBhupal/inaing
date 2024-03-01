package com.inaing.app.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.CartItem;
import com.inaing.app.entity.Order;
import com.inaing.app.mappers.CartItemMapper;
import com.inaing.app.repository.CartItemRepository;
import com.inaing.app.service.CartItemService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CartItemServiceImpl implements CartItemService{
    private final CartItemRepository repository;
    private final CartItemMapper cartItemMapper;
    
    @Override
    public CartItem save(CartItemRequestDto cartItemRequestDto, Order order) {
        CartItem cartItem = cartItemMapper.toCartItem(cartItemRequestDto);
        cartItem.set_order(order);
        return repository.save(cartItem);
    }
    
}
