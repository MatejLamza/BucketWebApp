package com.example.bucket.domain;

import javax.validation.constraints.NotEmpty;

public class User {

    @NotEmpty(message = "Name field cannot be empty!")
    private String name;

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public User() {
    }

    public User(String name, Long id) {
        this.name = name;
        this.id = id;
    }
}
