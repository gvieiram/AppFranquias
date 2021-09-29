package com.example.franquias.model;



import java.io.Serializable;

public class Restaurant implements Serializable {
    private String name;
    private final String address;
    private final String city;
    private final int image;

    public Restaurant(String name, String address, String city, int image) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public int getImage() {
        return image;
    }
}
