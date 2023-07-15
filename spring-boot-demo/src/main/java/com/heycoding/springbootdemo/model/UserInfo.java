package com.heycoding.springbootdemo.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class UserInfo {

    public UserInfo() {
    }

    public UserInfo(Long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private String password;

    @OneToMany(mappedBy = "userInfo")
    private List<Order> order;

}
