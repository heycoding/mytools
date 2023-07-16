package com.heycoding.springbootdemo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;

    @ManyToOne
    private UserInfo userInfo;

    private double memberDiscount;
    private double gst;
    private double total;
    private String paymentStatus;
    private String urls;
    private Date createDate;
    private String location;

    @OneToMany(mappedBy = "orderInfo")
    private List<Item> items;
}
