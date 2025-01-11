package com.malish;

public class Sculpture extends Artwork {
    // Properties specific to Sculpture
    private String material;
    private double weight;

    // Constructor that calls the superclass constructor
    public Sculpture(String name, String artistName, double price, String material, double weight) {
        super(name, artistName, price);  // Call Artwork constructor
        this.material = material;
        this.weight = weight;
    }

    // Getter for material
    public String getMaterial() {
        return material;
    }

    // Setter for material
    public void setMaterial(String material) {
        this.material = material;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Setter for weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Overridden showDetails method
    @Override
    public void showDetails() {
        System.out.println(getName() + " is a sculpture made by " + getArtistName() + " and costs " + getPrice() +
                ". It is made of " + material + " and weighs " + weight + "kg.");
    }
}
