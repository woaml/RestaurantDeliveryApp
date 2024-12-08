package com.ana.restaurantApp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    private Long price;

    @ManyToOne
    @JsonIgnore
    private Category category;

    @Column(length = 1000)
    @ElementCollection
    private List<String> images;

    private boolean available;

    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

    private boolean isVegetarian;

    @ManyToMany
    private List<Ingredient> ingredients = new ArrayList<>();
}