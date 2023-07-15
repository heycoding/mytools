package com.heycoding.springbootdemo.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String productCode;
    private String productName;
    private String supplierName;
    private String description;
    private String imageURL;
    private int currentStock;
    private int reorderLevel;
    private double unitPrice;
    @OneToMany(mappedBy = "product")
    private List<Item> item;
}
