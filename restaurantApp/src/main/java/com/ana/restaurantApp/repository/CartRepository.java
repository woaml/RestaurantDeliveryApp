package com.ana.restaurantApp.repository;

import com.ana.restaurantApp.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
    public Cart findCartByUserId(Long userId);
}
