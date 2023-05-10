package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Long> { //todos os metodos herdados, com os tipos de retorno, no caso o da identidade Food, e o tipo do identificador, no caso Long
}
