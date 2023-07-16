package com.heycoding.springbootdemo.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Wife {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany
    private List<Husband> husbands;
}
