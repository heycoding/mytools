package com.heycoding.springbootdemo.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemId;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Product product;
    private int orderQuantity;
    private double subTotal;

}
