package com.example.franquias.model;

import java.util.ArrayList;

public class Franchise {
    private String name;
    private final String description;
    private final int image;
    private final ArrayList<Restaurant> restaurants;

    public Franchise(String name, String description, int image, ArrayList<Restaurant> restaurants) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.restaurants = restaurants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

}
