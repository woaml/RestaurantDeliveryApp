package com.ana.restaurantApp.repository;

import com.ana.restaurantApp.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findByRestaurantId(Long id);
}