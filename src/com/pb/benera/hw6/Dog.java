package com.pb.benera.hw6;

import java.util.Objects;

public class Dog extends Animal {
    private String name;

    public Dog() {
        super ("Каша и кости", "Двор частного дома");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println ("Гав-гав-гав!!!!");
    }

    @Override
    public void eat() {
        System.out.println ("Собака ест......");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Dog dog = (Dog) o;
        return Objects.equals (name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash (name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
