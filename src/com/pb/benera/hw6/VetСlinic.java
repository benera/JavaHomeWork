package com.pb.benera.hw6;

public class VetСlinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = null;
        try {
            Class clazz = Class.forName (Veterinarian.class.getName ( ));
            veterinarian = (Veterinarian) clazz.newInstance ( );
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace ( );
        }

        Animal animals[] = new Animal[3];
        animals[0] = new Dog ( );
        animals[1] = new Cat ( );
        animals[2] = new Horse ( );


        System.out.println ("На приеме у ветеринара:");
        for (Animal animal : animals) {
            veterinarian.treatAnimal (animal);
        }

        System.out.println ("-------------------------------------------");
        Dog dog = new Dog ( );
        System.out.println ("Собачка делает:");
        dog.makeNoise ( );
        System.out.println ("Дали собаке корма.");
        dog.eat ( );
        System.out.println ("Собака поела,пора спать.");
        dog.sleap ("Собака");

    }

}
