package com.ana.restaurantApp.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Embeddable
@Data
public class RestaurantDTO {
    private Long id;

    private String title;

    @Column(length = 1000)
    private List<String> images;

    private String description;
}