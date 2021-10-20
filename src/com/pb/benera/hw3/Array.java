package com.pb.benera.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] mas = new int[10];
        int sum = 0;
        int count = 0;
        int c = 0;
        System.out.println ("Введите 10 чисел через пробел в одну строку:\n");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = input.nextInt ( );
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print (mas[i] + " ");

        }
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];

        }
        System.out.println ( );
        System.out.println ("Сумма всех элементов массива:" + sum);

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                count++;

        }
        System.out.println ("Кол-во положительных элементов в массиве:" + count);

        for (int i = 0; i < mas.length; i++) {
            for (int j = mas.length - 2; j >= i; j--) {
                if (mas[j] > mas[j + 1]) {
                    c = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = c;
                }


            }
            System.out.print(mas[i]+" ");
        }
        System.out.println("- массив отсортирован ");
    }

}

