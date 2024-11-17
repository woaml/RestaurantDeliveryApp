package com.ana.restaurantApp.request;

import com.ana.restaurantApp.model.Address;
import lombok.Data;

import java.util.List;

@Data
public class CreateRestaurantRequest {
    private Long id;
    private String name;
    private String description;
    private String cuisine;
    private Address address;
    private String openingHours;
    private String phone;
    private List<String> images;
}

