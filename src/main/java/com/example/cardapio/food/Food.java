package com.example.cardapio.food;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "TB_FOODS")
@Entity(name = "foods")
@Getter //lombok - gerar getters e setters desta classe em runtime
@NoArgsConstructor //lombok - declara um construtor sem argumento
@AllArgsConstructor //lombok - declara um construtor com todos os argumentos
@EqualsAndHashCode(of = "id") //lombok - id é a representação unica da entidade
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data) {
        this.title = data.title();
        this.image = data.image();
        this.price = data.price();
    }
}
