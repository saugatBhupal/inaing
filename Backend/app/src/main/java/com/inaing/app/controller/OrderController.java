package com.inaing.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inaing.app.dto.cartItem.CartItemRequestDto;
import com.inaing.app.entity.Order;
import com.inaing.app.service.OrderService;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/order")
@AllArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("")
    public Order postMethodName(@RequestBody List<CartItemRequestDto> items) {
       return(orderService.save(items));
    }
    
}
