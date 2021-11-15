package com.pb.benera.hw7;

public class Atelier {

    static void dressMan(Clothes[] clothes) {
        System.out.println ("Мужская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.println (clothe);
            }
        }
    }

    static void dressWomen(Clothes[] clothes) {
        System.out.println ("Женская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println (clothe);
            }
        }
    }

    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt (Size.L, "темно-серый", 350);
        Pants pants = new Pants (Size.XXS, "синий", 225);
        Skirt skirt = new Skirt (Size.S, "розовый", 400);
        Tie tie = new Tie (Size.L, "синий", 300);


        Clothes[] clothes1 = {tshirt, pants, skirt, tie};
        dressMan (clothes1);
        dressWomen (clothes1);

    }
}

