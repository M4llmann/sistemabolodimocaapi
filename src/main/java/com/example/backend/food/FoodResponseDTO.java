package com.example.backend.food;

public record FoodResponseDTO(Long id, String title, String image, Integer price, String description) {
    
    public FoodResponseDTO(Food food){
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice(), food.getDescription());
    }
}
