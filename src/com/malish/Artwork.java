package com.malish;

public class Artwork {
    // Fields to store the attributes
    private String name;
    private String artistName;
    private double price;

    // Default constructor
    public Artwork() {}

    // Overloaded constructor to initialize all fields
    public Artwork(String name, String artistName, double price) {
        this.name = name;
        this.artistName = artistName;
        this.price = price;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for artistName
    public String getArtistName() {
        return artistName;
    }

    // Setter for artistName
    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    // Method to show details of the artwork
    public void showDetails() {
        System.out.println(name + " is made by " + artistName + " and costs " + price);
    }
}
