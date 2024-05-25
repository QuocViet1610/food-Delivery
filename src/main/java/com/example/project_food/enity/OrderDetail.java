package com.example.project_food.enity;


import com.example.project_food.enity.key.OrderDetailKey;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "orderdetail")
public class OrderDetail {
    @EmbeddedId
    private com.example.project_food.enity.key.OrderDetailKey OrderDetailKey;

    @ManyToOne
    @JoinColumn(name ="order_id",insertable=false, updatable=false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name ="food_id",insertable=false, updatable=false)
    private Food food;

//    @Column(name="create_date")
//    private Date createDate;

    @Column(name="quanity")
    private int quanity;



}
