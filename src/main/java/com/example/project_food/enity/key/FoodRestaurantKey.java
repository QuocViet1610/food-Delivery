package com.example.project_food.enity.key;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class FoodRestaurantKey implements Serializable {
    @Column(name = "foodId")
    private int FoodId;

    @Column(name = "RestaurantId")
    private int RestuarantId;

    public FoodRestaurantKey() {
    }

    public FoodRestaurantKey(int foodId, int restuarantId) {
        FoodId = foodId;
        RestuarantId = restuarantId;
    }
}
