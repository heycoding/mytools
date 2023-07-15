package org.example.exam.s51.webapplication.q5.model;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemId;
    @OneToMany
    private Order order;
    @OneToOne
    private Product product;
    private int orderQuantity;
    private double subTotal;


}
