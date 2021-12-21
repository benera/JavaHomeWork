package com.pb.benera.hw13;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private List <Integer> gueue = new LinkedList ( );
    private final int limit = 5;


    public synchronized void add(int item) throws InterruptedException {
        while (gueue.size ( ) == limit) {
            System.out.println ("Очередь заполнена,подождите пока освободится место");
            wait ( );
        }
        if (gueue.size ( ) == 0) {
            System.out.println ("Производитель ! Очередь пустая,просыпаемся для добавления элемента ");
            notifyAll ( );
        }
        gueue.add (item);
        System.out.println ("Производитель положил элемент: " + item);

    }


    public synchronized int get() throws InterruptedException {
        while (gueue.size ( ) == 0) {
            System.out.println ("Очередь пустая,ждем пока положат элемент");
            wait ( );
        }
        if (gueue.size ( ) == limit) {
            System.out.println ("Потребитель! Очередь полная,просыпаемся для чтения элемента");
            notifyAll ( );
        }
        int item = this.gueue.remove (0);
        return item;

    }


}
