package com.inaing.app.OrderTest;

import com.inaing.app.entity.CartItem;
import com.inaing.app.entity.Order;
import com.inaing.app.repository.OrderRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Arrays;

@DataJpaTest
public class OrderTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void createOrderTest() {
        Order order = new Order();
        order.setCost(100.0);

        Assertions.assertNotNull(order);
    }

    @Test
    public void saveOrderTest() {
        Order order = new Order();
        order.setCost(100.0);

        orderRepository.save(order);

        Assertions.assertNotNull(order.getId());
    }

    @Test
    public void retrieveOrderTest() {
        Order order = new Order();
        order.setCost(100.0);

        orderRepository.save(order);

        Long orderId = order.getId();
        Order retrievedOrder = orderRepository.findById(orderId).orElse(null);

        Assertions.assertNotNull(retrievedOrder);
        Assertions.assertEquals(order.getCost(), retrievedOrder.getCost());
    }

    @Test
    public void updateOrderTest() {
        Order order = new Order();
        order.setCost(100.0);

        orderRepository.save(order);

        Long orderId = order.getId();
        Order retrievedOrder = orderRepository.findById(orderId).orElse(null);

        retrievedOrder.setCost(150.0);

        orderRepository.save(retrievedOrder);

        Order updatedOrder = orderRepository.findById(orderId).orElse(null);

        Assertions.assertNotNull(updatedOrder);
        Assertions.assertEquals(retrievedOrder.getCost(), updatedOrder.getCost());
    }

    @Test
    public void deleteOrderTest() {
        Order order = new Order();
        order.setCost(100.0);

        orderRepository.save(order);

        Long orderId = order.getId();

        orderRepository.deleteById(orderId);

        Order deletedOrder = orderRepository.findById(orderId).orElse(null);

        Assertions.assertNull(deletedOrder);
    }
}
