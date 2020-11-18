package com.example.bucket.domain;

import javax.validation.constraints.NotEmpty;

public class User {

    @NotEmpty(message = "Name field cannot be empty!")
    private String name;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }
}
