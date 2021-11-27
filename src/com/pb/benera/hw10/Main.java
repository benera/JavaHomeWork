package com.pb.benera.hw10;

public class Main {


    public static void main(String[] args) throws Exception {
        Numbox <Integer> numboxInteger = new Numbox <> ( );
        Numbox <Float> numboxFloat = new Numbox <> ( );
        numboxInteger.NumBox (2);
        numboxInteger.add (13);
        numboxInteger.add (10);
        numboxFloat.NumBox (2);
        numboxFloat.add (14.5f);
        numboxFloat.add (35.6f);
        System.out.println ("Число по индексу: " + numboxInteger.get (0));
        System.out.println ("Текущее количество элементов: " + numboxInteger.length ( ));
        System.out.println ("Среднее арифметическое: " + numboxInteger.average ( ));
        System.out.println ("Сумма всех элементов массива: " + numboxInteger.sum ( ));
        System.out.println ("Максимальный элемент массива: " + numboxInteger.max ( ));
        System.out.println ("================================================================");
        System.out.println ("Число по индексу: " + numboxFloat.get (1));
        System.out.println ("Текущее количество элементов: " + numboxFloat.length ( ));
        System.out.println ("Среднее арифметическое: " + numboxFloat.average ( ));
        System.out.println ("Сумма всех элементов массива: " + numboxFloat.sum ( ));
        System.out.println ("Максимальный элемент массива: " + numboxFloat.max ( ));
    }
}


