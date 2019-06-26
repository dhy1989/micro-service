package com.demo.entity;


import lombok.Data;

import java.math.BigDecimal;
/**
 * @author dinghy
 * @date
 */
@Data
public class User {

    private Long id;
    private String username;
    private Integer age;
    private Double balance;

    public User() {
        super();
    }

    public User(Long id, String username, Integer age, Double balance) {
        this.id = id;

        this.age = age;
        this.balance = balance;
    }
}