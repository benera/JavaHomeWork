package com.pb.benera.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
int operand1;
int operand2;
int result;
String sign;
        Scanner s =new Scanner(System.in);
        System.out.println ("Введите число operand1:\n");
        operand1 = s.nextInt();
        System.out.println ("Введите число operand2:\n");
        operand2 = s.nextInt();
        System.out.println ("Введите знак арифметической операции ('+';'-';'*';'/';:\n");
        sign = s.next ();
        switch (sign){
            case "+":
                result=operand1+operand2;
                System.out.println ("Ответ:"+ result);
                break;
            case "-":
                result=operand1-operand2;
                System.out.println ("Ответ:"+ result);
            case "*":
                result=operand1*operand2;
                System.out.println ("Ответ:"+ result);
            case "/":
                if (operand2==0){
                    System.out.println ("Делить на ноль нельзя!Введите другое число!");
                }
                else {
                    result = operand1 / operand2;
                    System.out.println ("Ответ:" + result);
                }


        }


    }
}
