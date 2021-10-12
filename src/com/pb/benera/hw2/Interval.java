package com.pb.benera.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        int number;
        Scanner s =new Scanner(System.in);
        System.out.println ("Введите число:\n");
        number = s.nextInt();
        if (number >=0 && number<=14) {
            System.out.println ("Число попадает в интервал [0-14]" );
        }
        else if (number >=15 && number<=35){
            System.out.println ("Число попадает в интервал [15-35]" );
        }
        else if (number >=36 && number<=50){
            System.out.println ("Число попадает в интервал [36-50]" );
        }
        else if (number >=51 && number<=100){
            System.out.println ("Число попадает в интервал [51-100]" );
        }
        else {
            System.out.println ("Число не попадает ни в один из указанных интервалов:[0-14] [15-35] [36-50] [51-100]" );
        }
    }
}
