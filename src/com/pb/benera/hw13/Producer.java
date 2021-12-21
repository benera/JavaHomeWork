package com.pb.benera.hw13;

import java.util.Random;


public class Producer implements Runnable {
    private final Queue queue;


    public Producer(Queue queue) {
        this.queue = queue;
    }


    @Override
    public void run() {
        System.out.println ("Производитель стартует......");
        int count = 0;
        while (count < 5) {
            try {
                int item = new Random ( ).nextInt (100);
                queue.add (item);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
        }

    }
}
