package com.malish;

public class Rectangle implements Shape {
    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implement getArea() method
    @Override
    public double getArea() {
        return length * breadth;
    }

    // Implement getPerimeter() method
    @Override
    public double getPerimeter() {
        return 2 * (length + breadth);
    }

    // Getters for length and breadth
    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
}
