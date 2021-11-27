package com.pb.benera.hw10;

public class Numbox<T extends Number> {
    private T[] mas;
    private int size;
    private int length;
    private double sum;

    public void NumBox(int size) {
        this.mas = (T[]) new Number[size];
        this.size = size;
    }


    public void add(T num) throws Exception {
        if (length >= size) {
            throw new Exception ("Массив переполнен");
        }
        mas[length] = num;
        sum += num.doubleValue ( );
        length++;
    }

    public T get(int index) {
        return mas[index];
    }

    public int length() {
        return mas.length;
    }

    public double average() {
        return sum / mas.length;
    }

    public double sum() {
        return sum;
    }

    public T max() {
        T maxElement = mas[0];
        for (int i = 0; i < length; i++) {
            if (mas[i].doubleValue ( ) > maxElement.doubleValue ( )) {
                maxElement = mas[i];
            }
        }
        return maxElement;
    }

}
