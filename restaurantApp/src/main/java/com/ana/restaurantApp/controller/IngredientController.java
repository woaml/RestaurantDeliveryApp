package com.ana.restaurantApp.controller;

import com.ana.restaurantApp.model.Ingredient;
import com.ana.restaurantApp.model.IngredientCategory;
import com.ana.restaurantApp.request.IngredientCategoryRequest;
import com.ana.restaurantApp.request.IngredientRequest;
import com.ana.restaurantApp.service.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/ingredients")
public class IngredientController {
    @Autowired
    private IngredientsService ingredientsService;

    @PostMapping("/category")
    public ResponseEntity<IngredientCategory> createIngredientCategory(
            @RequestBody IngredientCategoryRequest req
    ) throws Exception {
        IngredientCategory ingredientCategory = ingredientsService.createIngredientCategory(req.getName(), req.getRestaurantId());
        return new ResponseEntity<>(ingredientCategory, HttpStatus.CREATED);
    }

    @GetMapping("/restaurant/{id}/category")
    public ResponseEntity<List<IngredientCategory>> getRestaurantIngredientCategory(
            @PathVariable Long id
    ) throws Exception {
        List<IngredientCategory> ingredientCategories = ingredientsService.findIngredientCategoryByRestaurantId(id);
        return new ResponseEntity<>(ingredientCategories, HttpStatus.OK);
    }

    @PostMapping()
    public ResponseEntity<Ingredient> createIngredient(
            @RequestBody IngredientRequest req
    ) throws Exception {
        Ingredient ingredient = ingredientsService.createIngredient(req.getRestaurantId(), req.getName(), req.getCategoryId());
        return new ResponseEntity<>(ingredient, HttpStatus.CREATED);
    }

    @PutMapping("/{id}/stoke")
    public ResponseEntity<Ingredient> updateIngredientStock(
            @PathVariable Long id
    ) throws Exception {
        Ingredient ingredient = ingredientsService.updateStock(id);
        return new ResponseEntity<>(ingredient, HttpStatus.OK);
    }

    @GetMapping("/restaurant/{id}")
    public ResponseEntity<List<Ingredient>> getRestaurantIngredient(
            @PathVariable Long id
    ) throws Exception {
        List<Ingredient> ingredients = ingredientsService.findRestaurantsIngredients(id);
        return new ResponseEntity<>(ingredients, HttpStatus.OK);
    }
}