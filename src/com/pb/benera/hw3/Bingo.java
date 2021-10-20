package com.pb.benera.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int random;
        int guess;
        int count = 0;
        Random generator = new Random ( );
        random = generator.nextInt (101);
        System.out.println ("Для выхода из игры введите - 000");
        System.out.println ("Угадай число в диапазоне от 0 до 100:\n");

        while (count<101){
            count+=1;
            guess=input.nextInt();
            if(guess==000){
                break;
            }
            if (guess > random) {
                System.out.println ("Задуманное число является  меньше вводимого!\n");


            }  if (guess < random) {
                System.out.println ("Задуманное число является  больше вводимого!\n");


            }  if (guess == random) {
                System.out.println ("Поздравляю Вы угадали за " + count + " попыток");
                break;

            }
        }
        System.out.println("Игра окончена");

    }
}