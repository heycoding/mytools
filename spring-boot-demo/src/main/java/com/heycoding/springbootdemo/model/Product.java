package org.example.exam.s51.webapplication.q5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
}
