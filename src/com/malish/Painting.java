package com.malish;

public class Painting extends Artwork {
    // Properties specific to Painting
    private String paintType;
    private double canvasWidth;
    private double canvasHeight;

    // Constructor that calls the superclass constructor
    public Painting(String name, String artistName, double price, String paintType, double canvasWidth, double canvasHeight) {
        super(name, artistName, price);  // Call Artwork constructor
        this.paintType = paintType;
        this.canvasWidth = canvasWidth;
        this.canvasHeight = canvasHeight;
    }

    // Getter for paintType
    public String getPaintType() {
        return paintType;
    }

    // Setter for paintType
    public void setPaintType(String paintType) {
        this.paintType = paintType;
    }

    // Getter for canvasWidth
    public double getCanvasWidth() {
        return canvasWidth;
    }

    // Setter for canvasWidth
    public void setCanvasWidth(double canvasWidth) {
        this.canvasWidth = canvasWidth;
    }

    // Getter for canvasHeight
    public double getCanvasHeight() {
        return canvasHeight;
    }

    // Setter for canvasHeight
    public void setCanvasHeight(double canvasHeight) {
        this.canvasHeight = canvasHeight;
    }

    // Overridden showDetails method
    @Override
    public void showDetails() {
        System.out.println(getName() + " is a painting made by " + getArtistName() + " and costs " + getPrice() +
                ". It is painted with " + paintType + " on a canvas of " + canvasWidth + "x" + canvasHeight + " meters.");
    }
}
