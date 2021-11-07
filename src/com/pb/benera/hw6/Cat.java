package com.pb.benera.hw6;

import java.util.Objects;

public class Cat extends Animal {
    private String color;

    public Cat() {
        super ("Молоко и рыба", "Квартира");
    }

   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println ("Мя-я-я-я-я-я-у!!!!");
    }

    @Override
    public void eat() {
        System.out.println ("Кошка ест.......");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Cat cat = (Cat) o;
        return Objects.equals (color, cat.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash (color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
