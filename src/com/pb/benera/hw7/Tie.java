package com.pb.benera.hw7;

public class Tie extends Clothes implements ManClothes {
    public Tie(Size size, String color, double cost) {
        super (size, color, cost);
    }

    @Override
    public String toString() {
        return "Галстук{" +
                "размер = " + getSize ( ) +
                ", цена = " + getCost ( ) + " грн" +
                ", цвет = " + getColor ( ) +
                "}";
    }
}
