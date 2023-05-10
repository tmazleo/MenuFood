package com.example.cardapio.food;

public record FoodResponseDTO(Long id,String title, String image, Integer price) { //record para dados que vão ser estaticos, sem métodos para manuseio


    public FoodResponseDTO(Food food) {
    this(food.getId(), food.getTitle(), food.getImage(), food.getPrice());
    }
}
