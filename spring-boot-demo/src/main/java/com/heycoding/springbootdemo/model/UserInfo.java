package com.heycoding.springbootdemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserInfo {

    public UserInfo() {
    }

    public UserInfo(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String username;

    private String firstname;

    private String lastname;

    private String password;

}
