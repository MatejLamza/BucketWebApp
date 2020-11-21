package com.example.bucket.domain;

import java.util.List;

public class Category {
    private String name;
    private String image;
    private List<CategoryEntry> entries;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<CategoryEntry> getEntries() {
        return entries;
    }

    public void setEntries(List<CategoryEntry> entries) {
        this.entries = entries;
    }
}
