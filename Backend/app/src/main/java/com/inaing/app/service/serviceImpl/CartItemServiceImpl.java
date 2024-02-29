package com.inaing.app.service.serviceImpl;

import org.springframework.stereotype.Service;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.CartItem;
import com.inaing.app.mappers.CartItemMapper;
import com.inaing.app.repository.CartItemRepository;
import com.inaing.app.service.CartItemService;
import com.inaing.app.service.OrderService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CartItemServiceImpl implements CartItemService{
    private final CartItemRepository repository;
    private final OrderService orderService;
    private final CartItemMapper cartItemMapper;
    
    @Override
    public CartItem save(CartItemRequestDto cartItemRequestDto, Long orderID) {
        CartItem cartItem = cartItemMapper.toCartItem(cartItemRequestDto);
        cartItem.setOrder(orderService.findById(orderID));
        return repository.save(cartItem);
    }
    
}
