package com.ana.restaurantApp.request;

import com.ana.restaurantApp.model.Category;
import com.ana.restaurantApp.model.Ingredient;
import lombok.Data;

import java.util.List;

@Data
public class CreateFoodRequest {
    private String name;
    private String description;
    private Long price;
    private Category category;
    private List<String> images;
    private Long restaurantId;
    private boolean vegetarian;
    private List<Ingredient> ingredients;
}

