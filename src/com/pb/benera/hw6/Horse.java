package com.pb.benera.hw6;

import java.util.Objects;

public class Horse extends Animal {
    private double weight;

    public Horse() {
        super ("Сено", "Конеферма");
    }


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void makeNoise() {
        System.out.println ("Иго-го-го-го!!!!");
    }

    @Override
    public void eat() {
        System.out.println ("Лошадь ест......");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Horse horse = (Horse) o;
        return Double.compare (horse.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash (weight);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
