package com.ana.restaurantApp.service;

import com.ana.restaurantApp.model.Category;
import com.ana.restaurantApp.model.Food;
import com.ana.restaurantApp.model.Restaurant;
import com.ana.restaurantApp.request.CreateFoodRequest;

import java.util.List;

public interface FoodService {
    public Food createFood(CreateFoodRequest req, Category category, Restaurant restaurant);

    void deleteFood(Long foodId) throws Exception;

    public List<Food> getRestaurantsFood (Long restaurantId,
                                          boolean isVegetarian,
                                          String foodCategory);

    public List<Food> searchFood(String keyword);

    public Food findFoodById(Long foodId) throws Exception;

    public Food updateAvailabilityStatus(Long foodId) throws Exception;
}
