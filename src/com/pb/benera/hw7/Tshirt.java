package com.pb.benera.hw7;

public class Tshirt extends Clothes implements ManClothes, WomenClothes {

    public Tshirt(Size size, String color, double cost) {
        super (size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка{" +
                "размер = " + getSize ( ) +
                ", цена = " + getCost ( ) + " грн" +
                ", цвет = " + getColor ( ) +
                "}";
    }
}

