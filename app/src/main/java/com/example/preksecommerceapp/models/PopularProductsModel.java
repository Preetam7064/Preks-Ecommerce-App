package com.example.preksecommerceapp.models;

import java.io.Serializable;

public class PopularProductsModel implements Serializable {
    String img_url;
    String name;
    String rating;
    String description;
    int price;

    public PopularProductsModel() {
    }

    public PopularProductsModel(String img_url, String name, String rating, String description, int price) {
        this.img_url = img_url;
        this.name = name;
        this.rating = rating;
        this.description = description;
        this.price = price;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
