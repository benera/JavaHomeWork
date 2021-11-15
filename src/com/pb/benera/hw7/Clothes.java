package com.pb.benera.hw7;

public abstract class Clothes {
    private Size size;
    private String color;
    private double cost;


    public Clothes(Size size, String color, double cost) {
        this.size = size;
        this.color = color;
        this.cost = cost;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
