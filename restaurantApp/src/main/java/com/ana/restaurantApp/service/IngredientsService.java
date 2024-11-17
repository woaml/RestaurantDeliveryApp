package com.ana.restaurantApp.service;

import com.ana.restaurantApp.model.Ingredient;
import com.ana.restaurantApp.model.IngredientCategory;

import java.util.List;

public interface IngredientsService {
    public IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception;

    public IngredientCategory findIngredientCategoryById(Long Id) throws Exception;

    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long restaurantId) throws Exception;

    public Ingredient createIngredient(Long restaurantId, String ingredientName, Long categoryId) throws Exception;

    public List<Ingredient> findRestaurantsIngredients(Long restaurantId);

    public Ingredient updateStock(Long id) throws Exception;
}
