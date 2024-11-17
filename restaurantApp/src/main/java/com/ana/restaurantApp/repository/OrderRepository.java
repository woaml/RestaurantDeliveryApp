package com.ana.restaurantApp.repository;

import com.ana.restaurantApp.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    public List<Order> findByUserId(Long userId);
    public List<Order> findByRestaurantId(Long restaurantId);
}