package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(schema = "public", name = "car")
public class Car {
    @Id
    private String id;
    private String brand;
    private String model;
    private String color;
    private int year;

    public Car() {
    }

    public Car(String id, String brand, String model, String color, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
