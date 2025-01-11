package com.malish;

public class Product {
    private int id;
    private double price;
    private String name;
    private int categoryID;

    public Product() {}

    public Product(int id, double price, String name, int categoryID) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.categoryID = categoryID;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }
}
