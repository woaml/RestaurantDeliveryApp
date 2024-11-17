package com.ana.restaurantApp.service;

import com.ana.restaurantApp.model.Ingredient;
import com.ana.restaurantApp.model.IngredientCategory;
import com.ana.restaurantApp.model.Restaurant;
import com.ana.restaurantApp.repository.IngredientCategoryRepository;
import com.ana.restaurantApp.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientsServiceImpl implements IngredientsService{
    @Autowired
    private IngredientRepository ingredientRepository;

    @Autowired
    private IngredientCategoryRepository ingredientCategoryRepository;

    @Autowired
    private RestaurantService restaurantService;

    @Override
    public IngredientCategory createIngredientCategory(String name, Long restaurantId) throws Exception {
        Restaurant restaurant = restaurantService.findRestaurantById(restaurantId);
        IngredientCategory category = new IngredientCategory();
        category.setName(name);
        category.setRestaurant(restaurant);
        return ingredientCategoryRepository.save(category);
    }

    @Override
    public IngredientCategory findIngredientCategoryById(Long id) throws Exception {
        Optional<IngredientCategory> ingredientCategory = ingredientCategoryRepository.findById(id);
        if (ingredientCategory.isEmpty()){
            throw new Exception("Ingredient category not found.");
        }
        return ingredientCategory.get();
    }

    @Override
    public List<IngredientCategory> findIngredientCategoryByRestaurantId(Long restaurantId) throws Exception {
        restaurantService.findRestaurantById(restaurantId);
        return ingredientCategoryRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public Ingredient createIngredient(Long restaurantId, String ingredientName, Long categoryId) throws Exception {
        Restaurant restaurant = restaurantService.findRestaurantById(restaurantId);
        IngredientCategory category = findIngredientCategoryById(categoryId);
        Ingredient ingredient = new Ingredient();
        ingredient.setName(ingredientName);
        ingredient.setRestaurant(restaurant);
        ingredient.setIngredientCategory(category);
        Ingredient savedIngredient = ingredientRepository.save(ingredient);
        category.getIngredients().add(savedIngredient);
        return savedIngredient;
    }

    @Override
    public List<Ingredient> findRestaurantsIngredients(Long restaurantId) {
        return ingredientRepository.findByRestaurantId(restaurantId);
    }

    @Override
    public Ingredient updateStock(Long id) throws Exception {
        Optional<Ingredient> optionalIngredient = ingredientRepository.findById(id);
        if(optionalIngredient.isEmpty()){
            throw new Exception("Ingredient not found.");
        }
        Ingredient ingredient = optionalIngredient.get();
        ingredient.setInStoke(!ingredient.isInStoke());
        return ingredientRepository.save(ingredient);
    }
}
