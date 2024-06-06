package com.example.backend.food;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name="foods")
@Entity(name="foods")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;

    private String title;

    private String image;

    private Integer price;

    private String description;


public Food(FoodRequestDTO data){
    this.title = data.title();
    this.image = data.image();
    this.price = data.price();
    this.description = data.description();
    }   

}