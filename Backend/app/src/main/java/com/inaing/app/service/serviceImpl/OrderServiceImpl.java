package com.inaing.app.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.CartItem;
import com.inaing.app.entity.Order;
import com.inaing.app.repository.OrderRepository;
import com.inaing.app.service.CartItemService;
import com.inaing.app.service.OrderService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{
    private final CartItemService cartItemService;
    private final OrderRepository repository;

    @Override
    public Order save(List<CartItemRequestDto> items) {
        Order order = repository.save(new Order());
        List<CartItem> items2 = new ArrayList<>();
        for(CartItemRequestDto item : items){
            items2.add(cartItemService.save(item, order));
        }
        order.setCartItems(items2);
        return(repository.save(order));
    }

    @Override
    public Order findById(Long id) {
        return(repository.findById(id).get());
    }
    
}
